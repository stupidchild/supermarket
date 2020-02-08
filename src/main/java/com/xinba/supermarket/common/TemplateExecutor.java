package com.xinba.supermarket.common;


import com.xinba.supermarket.common.Util.LoggerUtil;
import com.xinba.supermarket.common.Util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;


/**
 * controller处理模板
 * @author wb-wqm380153
 * @version $Id: TemplateExecutor.java, v 0.1 2018年06月14日 13:34 wb-wqm380153 Exp $
 */
public class TemplateExecutor {

    /** 日志对象 */
    private static final Logger LOGGER        = LoggerFactory.getLogger(TemplateExecutor.class);


    /** 是否成功标识 */
    private final static String SUCCESS       = "success";
    /** 业务code */
    private final static String CODE          = "code";
    /** 提示 */
    private final static String MESSAGE       = "message";
    /** 数据内容 */
    private final static String DATA          = "data";
    /** 分页信息 */
    private final static String PAGINATION    = "pagination";

    /**
     * controller统一模板处理类
     * <br>不要在外部设置ModelMap</br>
     * @param title 调用方title
     * @param result 数据内容
     * @param tempLate 模板实现对象
     * */
    public static ModelMap execute(String title, BaseResult result,
                               ControllerTempLate tempLate) {
        return execute(title, result, LOGGER, tempLate);
    }

    /**
     * controller统一模板处理类
     * <br>不要在外部设置ModelMap</br>
     * @param title 调用方title
     * @param result 数据内容
     * @param tempLate 模板实现对象
     * */
    public static ModelMap execute(String title, BaseResult result, Logger logger,
                               ControllerTempLate tempLate) {

        String titleStr = getTitle(title);
        return handleExecute(titleStr, result, logger, tempLate);
    }

    /**
     * controller统一模板处理类，新增统一入参日志打印
     * <br>不要在外部设置ModelMap</br>
     * @param title 调用方title
     * @param result 数据内容
     * @param param 参数对象
     * @param tempLate 模板实现对象
     * */
    public static ModelMap execute(String title, BaseResult result, Object param,
                               ControllerTempLate tempLate) {

        String titleStr = getTitle(title);
        LoggerUtil.info(LOGGER, titleStr + "入参：{0}", param);
        return handleExecute(titleStr, result, LOGGER, tempLate);
    }

    /**
     * controller统一模板处理类，新增统一入参日志打印
     * <br>不要在外部设置ModelMap</br>
     * @param result 数据内容
     * @param param 参数对象
     * @param tempLate 模板实现对象
     * */
    public static ModelMap execute(BaseResult result, Object param,
                               ControllerTempLate tempLate) {
        if (result == null) {
            result = new BaseResult();
        }

        String titleStr = getTitle("");
        LoggerUtil.info(LOGGER, titleStr + "入参：{0}", param);
        return handleExecute(titleStr, result, LOGGER, tempLate);
    }

    /**
     * controller统一模板处理类，新增统一入参日志打印
     * <br>不要在外部设置ModelMap</br>
     * @param result 数据内容
     * @param param 参数对象
     * @param tempLate 模板实现对象
     * */
    public static ModelMap execute(BaseResult result, Object param,
                               ControllerTempLate tempLate, Logger logger) {
        if (result == null) {
            result = new BaseResult();
        }

        String titleStr = getTitle("");
        LoggerUtil.info(logger, titleStr + "入参：{0}", param);
        return handleExecute(titleStr, result, logger, tempLate);
    }

    /**
     *
     * @param title
     * @param result
     * @param logger
     * @param tempLate
     */
    private static ModelMap handleExecute(String title, BaseResult result,
                                      Logger logger, ControllerTempLate tempLate) {

        ModelMap modelMap = new ModelMap();
        String errorCode = "-";
        String errorMsg = "-";
        try {

            //先清空入参
            modelMap.clear();

            tempLate.verifier(modelMap);

            tempLate.business(modelMap);

            LoggerUtil.info(logger, "[{0}][{1}]执行成功, result={2}", title, "业务处理通过",
                    result == null ? "-" : result.getData());

            modelMap.addAttribute(SUCCESS, result.isSuccess());

            if (result.getData() != null) {
                modelMap.addAttribute(DATA, result.getData());
            }
            if (result.getCode() != null) {
                modelMap.addAttribute(CODE, result.getCode());
            }
            if (result.getMessage() != null) {
                modelMap.addAttribute(MESSAGE, result.getMessage());
            }
            if (result.getPagination() != null) {
                modelMap.addAttribute(PAGINATION, result.getPagination());
            }

        } catch (XinbaException e) {
            LoggerUtil.error(e, logger, "[{0}]执行异常，错误提示：{1}", title, e.getMessage());
            errorCode = e.getErrorCode();
            errorMsg = e.getMessage();
            modelMap.addAttribute(SUCCESS, false);
            modelMap.addAttribute(MESSAGE, errorMsg);
            modelMap.addAttribute(CODE, errorCode);
        } catch (Exception e) {
            LoggerUtil.error(e, logger, "[{0}]执行失败，errorMsg={1}", title, e.getMessage());
            errorMsg = "未知异常";
            modelMap.addAttribute(SUCCESS, false);
            modelMap.addAttribute(MESSAGE, errorMsg);
        } catch (Throwable t) {
            LoggerUtil.error(t, logger, "[系统异常][{0}]执行失败, errorMsg={1}", title, t.getMessage());
            errorMsg = "系统异常";
            modelMap.addAttribute(SUCCESS, false);
            modelMap.addAttribute(MESSAGE, errorMsg);
        }
        return modelMap;
    }

    /**
     * 获取title
     * @param title
     * @return
     */
    private static String getTitle(String title) {
        StringBuilder builder = new StringBuilder();
        Exception exception = new Exception();
        builder.append(exception.getStackTrace()[2].getClassName()).append(".");
        builder.append(exception.getStackTrace()[2].getMethodName());
        if (!StringUtil.isEmpty(title)) {
            builder.append("-");
        }
        builder.append(title).append("：");
        return builder.toString();
    }

}
