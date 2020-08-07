package com.z.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *  公共实体
 * @author zming
 * @version V1.0
 * @description
 * @date 2020/8/6 0006 10:07
 **/
@Data
public class BaseEntity implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField(value = "creator",fill = FieldFill.INSERT)
    private Date creator;

    @TableField(value = "create_date",fill = FieldFill.INSERT)
    private Date createDate;

    @TableField(value = "updater",fill = FieldFill.INSERT_UPDATE)
    private Date updater;

    @TableField(value = "update_date",fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;

    @TableField(value = "disable",fill = FieldFill.INSERT)
    private Integer disable;

    @TableField(value = "remark",fill = FieldFill.INSERT)
    private String remark;


}
