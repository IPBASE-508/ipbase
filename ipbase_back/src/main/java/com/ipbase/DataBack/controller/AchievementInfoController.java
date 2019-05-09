package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.entity.AchievementInfo;
import com.ipbase.DataBack.service.AchievementInfoService;
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
 * @date 2019-05-04 21:54
 */
@RestController
@RequestMapping("/achievements")
public class AchievementInfoController implements CommonController<AchievementInfo>{

    @Autowired
    private AchievementInfoService service;

    /**
     * @apiDefine Achievement 成果
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /achievements/add 添加成果(TODO 欠文件上传)
     * @apiGroup Achievement
     * @apiParam {int} authorId 作者账号id
     * @apiParam {String} name 成果名称(标题)
     * @apiParam {String} author 作者账号名称
     * @apiParam {String} brief 成果简介
     * @apiSuccessExample Success-Request:
     * {
     *     authorId:1
     *     name:基地官网的后端系统做完第一版了！
     *     author:曾天臆
     *     brief:以后大家可以用来管理官网的数据
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
    public CommonDTO add(AchievementInfo data){
        try{
            data.setCreateTime(new Date());
            return CommonDTOUtil.success(service.addSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /achievements/update 修改成果
     * @apiGroup Achievement
     * @apiParam {int} id 成果id
     * @apiParam {int} authorId 作者账号id
     * @apiParam {String} name 成果名称(标题)
     * @apiParam {String} author 作者账号名称
     * @apiParam {String} brief 成果简介
     * @apiSuccessExample Success-Request:
     * {
     *     id:1
     *     brief:以后大家可以用来管理官网的数据，可以找人做展示网站了
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
    public CommonDTO update(AchievementInfo data) {
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
     * @api {post} /achievements/delete 删除成果
     * @apiGroup Achievement
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
    public CommonDTO delete(AchievementInfo data) {
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
     * @api {get} /achievements/list 分页获取成果
     * @apiGroup Achievement
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
    "name": "基地官网的后端系统做完第一版了！",
    "brief": "以后大家可以用来管理官网的数据，可以找人做展示网站了",
    "author": "曾天臆",
    "authorId": 1,
    "createTime": "2019-05-07T08:16:57.000+0000"
    }
    ]
     * }
     */
    @Override
    @GetMapping("/list")
    public CommonDTO list(AchievementInfo data) {
        try{
            return CommonDTOUtil.success(service.listByPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /achievements/one 获取单个成果详情(TODO 欠加图片)
     * @apiGroup Achievement
     * @apiParam {int} id 成果id
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
    "name": "基地官网的后端系统做完第一版了！",
    "brief": "以后大家可以用来管理官网的数据，可以找人做展示网站了",
    "author": "曾天臆",
    "authorId": 1,
    "createTime": "2019-05-07T08:16:57.000+0000"
    }
     * }
     */
    @Override
    @GetMapping("/one")
    public CommonDTO one(AchievementInfo data) {
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
     * @api {get} /achievements/pageByAuthor 按用户分页获取成果
     * @apiGroup Achievement
     * @apiParam {int} authorId 作者账号id
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     authorId:1
    page:1
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
    "name": "基地官网的后端系统做完第一版了！",
    "brief": "以后大家可以用来管理官网的数据，可以找人做展示网站了",
    "author": "曾天臆",
    "authorId": 1,
    "createTime": "2019-05-07T08:16:57.000+0000"
    }
    ]
     * }
     */
    @Override
    @GetMapping("/pageByAuthor")
    public CommonDTO listByFilter(AchievementInfo data) {
        try{
            if (data.getAuthorId() == 0){
                return CommonDTOUtil.error(403,"请传入创建者id",data);
            }
            return CommonDTOUtil.success(service.listByObjectPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }


}
