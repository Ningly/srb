package com.atguigu.srb.core.mapper;

import com.atguigu.srb.core.pojo.entity.UserAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.math.BigDecimal;

/**
 * <p>
 * 用户账户 Mapper 接口
 * </p>
 *
 * @author Helen
 * @since 2021-06-13
 */
public interface UserAccountMapper extends BaseMapper<UserAccount> {

    void updateAccount(String bindCode, BigDecimal amount, BigDecimal freezeAmount);
}
