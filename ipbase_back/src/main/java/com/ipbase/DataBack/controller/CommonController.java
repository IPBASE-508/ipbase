package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.dto.CommonDTO;

/**
 * 【这个接口类的存在，仅仅是为了少敲一些代码，缩短一些开发时间，可有可无】
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
