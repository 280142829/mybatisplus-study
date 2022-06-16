package com.jiangwei.mybatisplusstudy.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value="Customers对象", description="")
public class Customers implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "customerNumber", type = IdType.AUTO)
    private Integer customerNumber;

    @TableField("customerName")
    private String customerName;

    @TableField("contactLastName")
    private String contactLastName;

    @TableField("contactFirstName")
    private String contactFirstName;

    private String phone;

    @TableField("addressLine1")
    private String addressLine1;

    @TableField("addressLine2")
    private String addressLine2;

    private String city;

    private String state;

    @TableField("postalCode")
    private String postalCode;

    private String country;

    @TableField("salesRepEmployeeNumber")
    private Integer salesRepEmployeeNumber;

    @TableField("creditLimit")
    private BigDecimal creditLimit;


}
