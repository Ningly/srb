package com.atguigu.common.exception;

import com.atguigu.common.result.ResponseEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Assert {
    public static void notNull(Object obj, ResponseEnum responseEnum){
        if (obj==null){
            log.info("obj is null...............");
            throw new BusinessException(responseEnum);
        }
    }
}
