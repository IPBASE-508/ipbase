package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.entity.PictureInfo;
import com.ipbase.DataBack.service.PictureInfoService;
import com.ipbase.DataBack.dto.CommonDTO;
import com.ipbase.DataBack.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * TODO 有测试数据示例未补充完
 * @author tianyi
 * @date 2019-05-04 21:55
 */
@RestController
@RequestMapping("/picture")
public class PictureInfoController{

    @Autowired
    private PictureInfoService service;

    /**
     * @apiDefine Picture 成果图片
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     *  @apiSuccess {Integer} allDataNum 数据库中满足条件的总条数（用于分页）
     */

    /**
     * @api {post} /picture/addByAchievement 新增图片
     * @apiGroup Picture
     * @apiParam {int} achievementId 成果id
     * @apiParam {String[]} names 图片名称数组
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @PostMapping("/add")
    public CommonDTO add(int achievementId, String[] names){
        try{
            if (achievementId == 0){
                return CommonDTOUtil.error(403,"请传入成果id");
            }
            for (String name : names){
                PictureInfo data = new PictureInfo();
                data.setCreateTime(new Date());
                data.setName(name);
                data.setAchievementId(achievementId);
                service.addSelective(data);
            }
            return CommonDTOUtil.success();
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage());
        }
    }

    /**
     * @api {post} /picture/update 修改图片信息
     * @apiGroup Picture
     * @apiParam {int} id 图片id
     * @apiParam {String} name 图片文件名称
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @PostMapping("/update")
    public CommonDTO update(PictureInfo data) {
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
     * @api {post} /picture/delete 删除图片
     * @apiGroup Picture
     * @apiParam {int} id 单个id(传参方式二选一)
     * @apiParam {int[]} ids 多个id(传参方式二选一)
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @PostMapping("/delete")
    public CommonDTO delete(PictureInfo data) {
        try{
            if (data.getId() == 0 && data.getIds() == null){
                return CommonDTOUtil.error(403,"请传入id",data);
            }
            return CommonDTOUtil.success(service.delete(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /picture/list 分页获取所有图片
     * @apiGroup Picture
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     page:1
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
    "name": "基地logo.png",
    "achievementId": 1,
    "createTime": "2019-05-13T23:47:25.000+0000"
    },
    {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": 2,
    "name": "test123.jpg",
    "achievementId": 1,
    "createTime": "2019-05-13T23:47:50.000+0000"
    }
    ],
    "allDataNum": null
     * }
     */
    @GetMapping("/list")
    public CommonDTO list(PictureInfo data) {
        try{
            return CommonDTOUtil.success(service.listByPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /picture/one 获取单张图片信息
     * @apiGroup Picture
     * @apiParam {int} id 图片id
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @GetMapping("/one")
    public CommonDTO one(PictureInfo data) {
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
     * @api {get} /picture/pageByAchievement 按成就id获取图片
     * @apiGroup Picture
     *  @apiParam {int} achievementId 成果id
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     page:1
    achievementId:1
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
    "name": "基地logo.png",
    "achievementId": 1,
    "createTime": "2019-05-13T23:47:25.000+0000"
    },
    {
    "ids": null,
    "rows": 20,
    "page": 0,
    "pageStart": 0,
    "message": null,
    "id": 2,
    "name": "哈哈哈开心.jpg",
    "achievementId": 1,
    "createTime": "2019-05-13T23:47:50.000+0000"
    }
    ],
    "allDataNum": 2
     * }
     */
    @GetMapping("/pageByAchievement")
    public CommonDTO listByFilter(PictureInfo data) {
        try{
            if (data.getAchievementId() == 0){
                return CommonDTOUtil.error(403,"请传入成果id",data);
            }
            CommonDTO rt = CommonDTOUtil.success(service.listByObjectPage(data));
            rt.setAllDataNum(service.countByExample(data));
            return rt;
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }
}
