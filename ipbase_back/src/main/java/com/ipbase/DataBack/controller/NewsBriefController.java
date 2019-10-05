package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.entity.NewsBrief;
import com.ipbase.DataBack.service.NewsBriefService;
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
 * @date 2019-05-04 21:55
 */
@RestController
@RequestMapping("/news/brief")
public class NewsBriefController implements CommonController<NewsBrief>{

    @Autowired
    private NewsBriefService service;

    /**
     * @apiDefine NewsBrief 新闻简要
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     *  @apiSuccess {Integer} allDataNum 数据库中满足条件的总条数（用于分页）
     */

    /**
     * @api {post} /news/brief/add 新增文章简要
     * @apiGroup NewsBrief
     * @apiParam {int} authorId 作者账号id(必填)
     * @apiParam {String} title 文章标题
     * @apiParam {String} brief 文章简述
     * @apiParam {String} author 作者名称
     * @apiSuccessExample Success-Request:
     * {
     *     authorId:2
    title:恭喜蓝桥杯获奖的同学们
    brief:蓝桥杯的获奖名单出来了，快来了解一下吧
    author:管理员0
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @Override
    @PostMapping("/add")
    public CommonDTO add(NewsBrief data) {
        try{
            if (data.getAuthorId() == 0){
                return CommonDTOUtil.error(403,"请传入作者id",data);
            }
            data.setCreateTime(new Date());
            data.setUpdateTime(new Date());
            return CommonDTOUtil.success(service.addSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /news/brief/update 更新文章简要
     * @apiGroup NewsBrief
     * @apiParam {int} id 文章简要id
     * @apiParam {String} title 文章标题
     * @apiParam {String} brief 文章简述
     * @apiParam {int} state 文章状态(0=草稿，1=已发布，-1=删除)
     * @apiSuccessExample Success-Request:
     * {
     *     id:2
     *     title:关于蓝桥杯比赛结果的新闻
     *     state:1
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
    public CommonDTO update(NewsBrief data) {
        try{
            if (data.getId() == 0){
                return CommonDTOUtil.error(403,"请传入id",data);
            }
            data.setUpdateTime(new Date());
            return CommonDTOUtil.success(service.updateSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /news/brief/delete 删除文章简要
     * @apiGroup NewsBrief
     * @apiParam {int} id 单个id(传参方式二选一)
     * @apiParam {int[]} ids 多个id(传参方式二选一)
     * @apiSuccessExample Success-Request:
     * {
     *     id:3
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
    public CommonDTO delete(NewsBrief data) {
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
     * @api {get} /news/brief/list 分页获取文章简要列表
     * @apiGroup NewsBrief
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
    "data": [],
    "allDataNum": 0
     * }
     */
    @Override
    @GetMapping("/list")
    public CommonDTO list(NewsBrief data) {
        try{
            data.setState(1);
            CommonDTO rt = CommonDTOUtil.success(service.listByStatePage(data));
            rt.setAllDataNum(service.countByExample(data));
            return rt;
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /news/brief/one 获取单个文章简要
     * @apiGroup NewsBrief
     * @apiParam {int} id 文章简要id
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
    "title": "恭喜蓝桥杯获奖的同学们",
    "brief": "蓝桥杯的获奖名单出来了，快来了解一下吧",
    "updateTime": "2019-05-09T06:23:19.000+0000",
    "createTime": "2019-05-09T06:23:19.000+0000",
    "author": "管理员0",
    "authorId": 1,
    "state": 0,
    "visit": 0
    }
     * }
     */
    @Override
    @GetMapping("/one")
    public CommonDTO one(NewsBrief data) {
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
     * @api {get} /news/brief/pageByState 按用户分页获取文章简要
     * @apiGroup NewsBrief
     * @apiParam {int} authorId 作者账号id
     * @apiParam {int} state 文章状态(0=草稿，1=已发布，-1=已删除)
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     authorId:1
     *     state:1
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [],
    "allDataNum": 0
     * }
     */
    @Override
    @GetMapping("/pageByState")
    public CommonDTO listByFilter(NewsBrief data) {
        try{
            CommonDTO rt = CommonDTOUtil.success(service.listByStatePage(data));
            rt.setAllDataNum(service.countByExample(data));
            return rt;
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /news/brief/pageByAuthorAndState 按作者与文章状态分页获取文章
     * @apiGroup NewsBrief
     * @apiParam {int} authorId 作者账号id
     * @apiParam {int} state 文章状态(0=草稿，1=已发布，-1=删除)
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     authorId:1
     *     state:0
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
    "title": "恭喜蓝桥杯获奖的同学们",
    "brief": "蓝桥杯的获奖名单出来了，快来了解一下吧",
    "updateTime": "2019-05-09T06:23:19.000+0000",
    "createTime": "2019-05-09T06:23:19.000+0000",
    "author": "管理员0",
    "authorId": 1,
    "state": 0,
    "visit": 0
    }
    ]
     * }
     */
    @GetMapping("/pageByAuthorAndState")
    public CommonDTO listByAuthorAndState(NewsBrief data) {
        try{
            if (data.getAuthorId() == 0){
                return CommonDTOUtil.error(403,"请传入创建者id",data);
            }
            return CommonDTOUtil.success(service.listByStatePage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }
}
