package com.zxu.service.impl;

import javax.annotation.Resource;

import com.zxu.mapper.GoodsMapper;
import com.zxu.util.common.Result;

/**
 * Service共用的对象
 * 
 * @author zhangxu
 */
public class BaseServiceImpl {
    @Resource
    protected GoodsMapper goodsMapper;

    protected Result result;
}
