package com.atguigu.srb.core.controller;


import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author Helen
 * @since 2021-06-13
 */
@RestController
@RequestMapping("/api/core/integralGrade")
public class IntegralGradeController {
    @GetMapping("/test")
    @ApiOperation("test")
    public String listAll(){
        return "integralGradeService.list()";
    }


}

