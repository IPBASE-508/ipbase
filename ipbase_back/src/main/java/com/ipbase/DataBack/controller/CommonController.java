package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.dto.CommonDTO;

/**
 * @author tianyi
 * @date 2019-05-04 23:09
 */
public interface CommonController<T> {

    public CommonDTO add(T data);

    public CommonDTO update(T data);

    public CommonDTO delete(T data);

    public CommonDTO list(T data);

    public CommonDTO one(T data);

    public CommonDTO listByFilter(T data);
}
