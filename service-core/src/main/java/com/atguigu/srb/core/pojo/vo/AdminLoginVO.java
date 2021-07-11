package com.atguigu.srb.core.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel(description="登录对象")
public class AdminLoginVO {

    @ApiModelProperty(value = "手机号")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;
}
