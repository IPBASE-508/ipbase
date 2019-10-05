package com.ipbase.DataBack.service;

import com.ipbase.DataBack.entity.UserInfo;

/**
 * @author tianyi
 * @date 2019-05-04 15:19
 */
public interface UserInfoService extends CrudService<UserInfo> {

    UserInfo login(UserInfo data) throws Exception;
}
