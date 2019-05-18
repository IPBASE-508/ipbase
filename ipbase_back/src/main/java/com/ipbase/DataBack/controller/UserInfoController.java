package com.ipbase.DataBack.controller;
import com.ipbase.DataBack.entity.UserInfo;
import com.ipbase.DataBack.service.UserInfoService;
import com.ipbase.DataBack.dto.CommonDTO;
import com.ipbase.DataBack.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author tianyi
 * @date 2019-05-04 21:56
 */
@RestController
@RequestMapping("/user")
public class UserInfoController implements CommonController<UserInfo>{

    @Autowired
    private UserInfoService service;

    /**
     * @apiDefine User 用户
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /user/add 新增用户账号
     * @apiGroup User
     * @apiParam {String} account 账号
     * @apiParam {String} password 密码
     * @apiParam {String} name 用户名称
     * @apiParam {int} roleId 角色id
     * @apiSuccessExample Success-Request:
     * {
     *     account:2016072000
    password:123456
    name:管理员0
    roleId:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *      "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @Override
    @PostMapping("/add")
    public CommonDTO add(UserInfo data){
        try{
            data.setCreateTime(new Date());
            return CommonDTOUtil.success(service.addSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /user/update 修改用户账号
     * @apiGroup User
     * @apiParam {int} id 账号id
     * @apiParam {String} account 账号
     * @apiParam {String} password 密码
     * @apiParam {String} name 用户名称
     * @apiParam {int} roleId 角色id
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
    password:ipbase508
    roleId:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *      "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @Override
    @PostMapping("/update")
    public CommonDTO update(UserInfo data) {
        try{
            if (data.getId() == 0){
                return CommonDTOUtil.error(403,"请传入id",data);
            }
            return CommonDTOUtil.success(service.updateSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /user/delete 删除用户账号(可批量)
     * @apiGroup User
     * @apiParam {int} id 单个id(传参方式二选一)
     * @apiParam {int[]} ids 多个id(传参方式二选一)
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *      "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @Override
    @PostMapping("/delete")
    public CommonDTO delete(UserInfo data) {
        try{
            if (data.getId() == 0 || data.getIds().length == 0){
                return CommonDTOUtil.error(403,"请传入id",data);
            }
            return CommonDTOUtil.success(service.delete(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /user/list 分页获取用户
     * @apiGroup User
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     page:1
    rows:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": 1,
    "account": "2016072007",
    "password": "123456",
    "name": "曾天臆",
    "roleId": 0,
    "createTime": "2019-05-05T03:57:05.000+0000"
    }
    ]
     * }
     */
    @Override
    @GetMapping("/list")
    public CommonDTO list(UserInfo data) {
        try{
            return CommonDTOUtil.success(service.listByPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /user/one 获取单个用户信息
     * @apiGroup User
     * @apiParam {int} id 用户id
     * @apiSuccessExample Success-Request:
     * {
     *     id:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": 1,
    "account": "2016072007",
    "password": "123456",
    "name": "曾天臆",
    "roleId": 0,
    "createTime": "2019-05-05T03:57:05.000+0000"
    }
     * }
     */
    @Override
    @GetMapping("/one")
    public CommonDTO one(UserInfo data) {
        try{
            if (data.getId() == 0){
                return CommonDTOUtil.error(403,"请传入id",data);
            }
            return CommonDTOUtil.success(service.getOneById(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /user/pageByFilter 条件筛选分页获取用户
     * @apiGroup User
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiParam {String} account 账号(精确查询)
     * @apiParam {String} name 姓名(模糊查询)
     * @apiSuccessExample Success-Request1:
     * {
     *     page:1
    rows:2
    account:2016072007
     * }
     * @apiSuccessExample Success-Request2:
     * {
     *     page:1
    rows:2
    name:曾
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": 1,
    "account": "2016072007",
    "password": "123456",
    "name": "曾天臆",
    "roleId": 0,
    "createTime": "2019-05-05T03:57:05.000+0000"
    }
    ]
     * }
     */
    @Override
    @GetMapping("/pageByFilter")
    public CommonDTO listByFilter(UserInfo data) {
        try{
            return CommonDTOUtil.success(service.listByObjectPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /user/login 用户登录
     * @apiGroup User
     * @apiParam {String} account 账号
     * @apiParam {String} password 密码
     * @apiSuccessExample Success-Request:
     * {
     *     account:2016072007
    password:123456
     * }
     * @apiErrorExample Error-Request1:
     * {
     *     account:2016072007
    password:123
     * }
     * @apiErrorExample Error-Request2:
     * {
     *     account:2016
    password:123
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": 1,
    "account": "2016072007",
    "password": "123456",
    "name": "曾天臆",
    "roleId": 0,
    "createTime": "2019-05-05T03:57:05.000+0000"
    }
     * }
     * @apiErrorExample Error-Response1:
     * {
     *     "resultCode": 500,
    "resultMsg": "密码不正确",
    "data": {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": null,
    "account": "2016072007",
    "password": "123",
    "name": null,
    "roleId": null,
    "createTime": null
    }
     * }
     * @apiErrorExample Error-Response2:
     * {
     *     "resultCode": 500,
    "resultMsg": "账号不存在",
    "data": {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": null,
    "account": "2016",
    "password": "123",
    "name": null,
    "roleId": null,
    "createTime": null
    }
     * }
     */
    @PostMapping("/login")
    public CommonDTO login(UserInfo data){
        try{
            return CommonDTOUtil.success(service.login(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }
}
