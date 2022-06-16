package com.jiangwei.mybatisplusstudy.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jw
 * @since 2022-06-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("plus_person")
@ApiModel(value="Person对象", description="")
public class Person implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "plus_id", type = IdType.AUTO)
    private String id;

    @TableField("plus_name")
    private String name;
    @TableField("plus_isdelete")
    private Integer isdelete;
    @TableField("plus_createtime")
    private Date createtime;
    @TableField("plus_updatetime")
    private Date updatetime;


}
