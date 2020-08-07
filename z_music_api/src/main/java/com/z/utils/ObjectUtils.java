package com.z.utils;

import cn.hutool.core.util.StrUtil;
import com.z.constant.BaseConstant;

/**
 *  用户工具类
 * @author zming
 * @version V1.0
 * @description
 * @date 2020/8/6 0006 10:51
 **/
public class ObjectUtils {


    /**
     *  获取当前用户信息
     * @return
     */
    public static User getUser(){
        User user = RedisUtils.get(StrUtil.format(BaseConstant.USER_LOGIN, BaseUtils.getToken()),User.class);
        return user;
    }

    /**
     *  获取当前用户ID
     * @return
     */
    public static Long getUserId(){
        return getUser().getId();
    }



}
