package com.cyc.easy.shop.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cyc.easy.shop.commons.domain.TbUser;
import com.cyc.easy.shop.commons.mapper.TbUserMapper;
import com.cyc.easy.shop.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private TbUserMapper tbUserMapper;
    @Override
    public List<TbUser> selectAll() {
        return tbUserMapper.selectAll();
    }
}
