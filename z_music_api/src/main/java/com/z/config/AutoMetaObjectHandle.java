package com.z.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 *  公共实体处理器
 * @author zming
 * @version V1.0
 * @description
 * @date 2020/8/6 0006 10:18
 **/
public class AutoMetaObjectHandle implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        setFieldValByName("createDate",new Date(),metaObject);
        setFieldValByName("updateDate",new Date(),metaObject);
        setFieldValByName("disable",1,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updateDate",new Date(),metaObject);
    }
}
