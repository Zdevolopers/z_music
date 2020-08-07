package com.z.utils;

import cn.hutool.core.util.StrUtil;
import com.z.constant.BaseConstant;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zming
 * @version V1.0
 * @description
 * @date 2020/8/6 0006 11:24
 **/
public class BaseUtils {

    /**
     *  线程隔离级别保存请求
     */
    private static ThreadLocal<HttpServletRequest> threadLocal = new ThreadLocal<>();


    /**
     *  判断当前操作系统是否为windows
     * @return
     */
    public static boolean isWindows(){
        return System.getProperty("os.name").toLowerCase().contains("windows");
    }


    /**
     *  保存当前请求
     * @param request
     */
    public static void setRequest(HttpServletRequest request){
        threadLocal.set(request);
    }


    /**
     *  获取当前的请求
     * @return
     */
    public static HttpServletRequest getRequest(){
        return threadLocal.get();
    }


    /**
     *  获取当前用户的token
     * @return
     */
    public static String getToken(){
        return getToken(getRequest());
    }


    /**
     *  在请求头/cookie中获取token的值
     * @param request
     * @return
     */
    private static String getToken(HttpServletRequest request){
        if(null == request){
            return null;
        }
        return StrUtil.isNotEmpty(request.getHeader(BaseConstant.USER_TOKEN))
                ?request.getHeader(BaseConstant.USER_TOKEN):getCookieValue(request,BaseConstant.USER_TOKEN);
    }


    /**
     *  获取请求中cookie的token值
     * @param request
     * @param name
     * @return
     */
    private static String getCookieValue(HttpServletRequest request, String name){
        Cookie[] cookies = request.getCookies();
        if(cookies == null || cookies.length == 0){
            return null;
        }
        String value = null;
        for (Cookie cookie : cookies) {
            if(name.equals(cookie.getName())){
                value =  cookie.getValue();
                break;
            }
        }
        return value;
    }


}
