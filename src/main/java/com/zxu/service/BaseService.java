package com.zxu.service;

import java.util.Map;

import com.zxu.util.common.Result;

/**
 * Service公共增删改查接口
 * 
 * @author zhangxu
 */
public interface BaseService<T> {
    Result save(T t);

    Result delete(Long id);

    Result update(T t);

    Result get(Long id);

    Result query(Map<String, Object> params);
}
