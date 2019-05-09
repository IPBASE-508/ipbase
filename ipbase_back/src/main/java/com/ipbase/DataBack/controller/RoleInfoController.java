package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.entity.RoleInfo;
import com.ipbase.DataBack.service.RoleInfoService;
import com.ipbase.DataBack.utils.CommonDTO;
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
@RequestMapping("/role")
public class RoleInfoController implements CommonController<RoleInfo>{

    @Autowired
    private RoleInfoService service;

    /**
     * @apiDefine Role 角色
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /role/add 新增角色
     * @apiGroup Role
     * @apiParam {String} name 角色名称
     * @apiParam {String} note 角色备注
     * @apiSuccessExample Success-Request:
     * {
     *     name:研发部成员
    note:普通研发部成员
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @Override
    @PostMapping("/add")
    public CommonDTO add(RoleInfo data){
        try{
            return CommonDTOUtil.success(service.addSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /role/update 修改角色信息
     * @apiGroup Role
     * @apiParam {int} id 角色id
     * @apiParam {String} name 角色名称
     * @apiParam {String} note 角色备注
     * @apiSuccessExample Success-Request:
     * {
     *     id:1
     *     note:限制部分权限，如..
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @Override
    @PostMapping("/update")
    public CommonDTO update(RoleInfo data) {
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
     * @api {post} /role/delete 删除角色(可批量)
     * @apiGroup Role
     * @apiParam {int} id 单个id(传参方式二选一)
     * @apiParam {int[]} ids 多个id(传参方式二选一)
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": 1
     * }
     */
    @Override
    @PostMapping("/delete")
    public CommonDTO delete(RoleInfo data) {
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
     * @api {get} /role/list 分页获取角色
     * @apiGroup Role
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     page:1
     *     rows:2
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
    "name": "研发部成员",
    "note": "普通研发部成员"
    }
    ]
     * }
     */
    @Override
    @GetMapping("/list")
    public CommonDTO list(RoleInfo data) {
        try{
            return CommonDTOUtil.success(service.listByPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /role/one 获取单个角色信息
     * @apiGroup Role
     * @apiParam {int} id 角色id
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
    "name": "研发部成员",
    "note": "普通研发部成员"
    }
     * }
     */
    @Override
    @GetMapping("/one")
    public CommonDTO one(RoleInfo data) {
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
     * @api {get} /role/pageByName 角色名称模糊筛选列表
     * @apiGroup Role
     * @apiParam {int} page 页号
     * @apiParam {String} name 搜索角色名称
     * @apiSuccessExample Success-Request:
     * {
     *     name:研发
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
    "name": "研发部成员",
    "note": "普通研发部成员"
    }
    ]
     * }
     */
    @Override
    @GetMapping("/pageByName")
    public CommonDTO listByFilter(RoleInfo data) {
        try{
            if (data.getName() == null){
                return CommonDTOUtil.error(403,"请传入角色名称",data);
            }
            return CommonDTOUtil.success(service.listByObjectPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }
}
