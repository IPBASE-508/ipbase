package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.entity.NewsDetail;
import com.ipbase.DataBack.service.NewsBriefService;
import com.ipbase.DataBack.service.NewsDetailService;
import com.ipbase.DataBack.dto.CommonDTO;
import com.ipbase.DataBack.utils.CommonDTOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2019-05-04 21:55
 */
@RestController
@RequestMapping("/news/detail")
public class NewsDetailController implements CommonController<NewsDetail>{

    @Autowired
    private NewsDetailService service;

    @Autowired
    private NewsBriefService newsBriefService;

    /**
     * @apiDefine NewsDetail 新闻详情
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     *  @apiSuccess {Integer} allDataNum 数据库中满足条件的总条数（用于分页）
     */

    /**
     * @api {post} /news/detail/add 添加文章详情
     * @apiGroup NewsDetail
     * @apiParam {int} briefId 文章简要信息id
     * @apiParam {String} content 富文本文章内容(建议html)
     * @apiSuccessExample Success-Request:
     * {
     *     briefId:1
    content:<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li></ul>
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
    public CommonDTO add(NewsDetail data){
        try{
            if (data.getBriefId() == 0){
                return CommonDTOUtil.error(403,"请传入文章简要id",data);
            }
            return CommonDTOUtil.success(service.addSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /news/detail/update 修改文章详情
     * @apiGroup NewsDetail
     * @apiParam {int} id 文章详情id
     * @apiParam {String} content 富文本文章内容(建议html)
     * @apiSuccessExample Success-Request:
     * {
     *     id:1
     *     content:<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li><li>学生3</li><li>学生4</li></ul>
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
    public CommonDTO update(NewsDetail data) {
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
     * @api {post} /news/detail/delete 删除文章详情
     * @apiGroup NewsDetail
     * @apiParam {int} page 页号
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
    public CommonDTO delete(NewsDetail data) {
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
     * @api {get} /news/detail/list 分页获取文章详情列表
     * @apiGroup NewsDetail
     * @apiParam {int} page 页号
     * @apiParam {int} rows 每页行数
     * @apiSuccessExample Success-Request:
     * {
     *     page:1
    rows:2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @Override
    @GetMapping("/list")
    public CommonDTO list(NewsDetail data) {
        try{
            return CommonDTOUtil.success(service.listByPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /news/detail/one 获取单个文章详情
     * @apiGroup NewsDetail
     * @apiParam {int} id 文章详情id
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
    "briefId": 1,
    "content": "<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li></ul>"
    }
     * }
     */
    @Override
    @GetMapping("/one")
    public CommonDTO one(NewsDetail data) {
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
     * @api {get} /news/detail/pageByBrief 按文章简要获取文章详情
     * @apiGroup NewsDetail
     * @apiParam {int} briefId 文章简要id
     * @apiSuccessExample Success-Request:
     * {
     *     briefId:1
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
    "briefId": 1,
    "content": "<h3>获奖名单如下:</h3><ul><li>学生1</li><li>学生2</li></ul>"
    }
    ],
    "allDataNum": null
     * }
     */
    @Override
    @GetMapping("/pageByBrief")
    public CommonDTO listByFilter(NewsDetail data) {
        try{
            if (data.getBriefId() == 0){
                return CommonDTOUtil.error(403,"请传入文章简要id",data);
            }
            newsBriefService.plusCountById(data.getBriefId());
            return CommonDTOUtil.success(service.listByObjectPage(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }
}
