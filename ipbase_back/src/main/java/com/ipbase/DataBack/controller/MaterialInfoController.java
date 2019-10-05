package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.entity.MaterialInfo;
import com.ipbase.DataBack.service.MaterialInfoService;
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
@RequestMapping("/materials")
public class MaterialInfoController implements CommonController<MaterialInfo>{

    @Autowired
    private MaterialInfoService service;

    /**
     * @apiDefine Material 资料
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     *  @apiSuccess {Integer} allDataNum 数据库中满足条件的总条数（用于分页）
     */

    /**
     * @api {post} /materials/add 添加资料
     * @apiGroup Material
     * @apiParam {int} authorId 作者账号id
     * @apiParam {String} name 资料文件名(同时也将会作为标题)
     * @apiParam {String} author 作者账号名称
     * @apiParam {String} description 资料描述
     * @apiSuccessExample Success-Request:
     * {
     *     authorId: 1
     *     name: 高数复习资料.zip
     *     author: 管理员0
     *     description: 前人整理的复习资料，有需要的小伙伴尽管拿去吧
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
    public CommonDTO add(MaterialInfo data){
        try{
            if (data.getName() == null){
                return CommonDTOUtil.error(403, "未传入资料的文件名称", data);
            }
            data.setCreateTime(new Date());
            return CommonDTOUtil.success(service.addSelective(data));
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {post} /materials/update 修改资料
     * @apiGroup Material
     * @apiParam {int} id 资料id
     * @apiParam {String} name 资料名称(标题)
     * @apiParam {String} description 资料描述
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @Override
    @PostMapping("/update")
    public CommonDTO update(MaterialInfo data) {
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
     * @api {post} /materials/delete 删除资料
     * @apiGroup Material
     * @apiParam {int} id 单个id(传参方式二选一)
     * @apiParam {int[]} ids 多个id(传参方式二选一)
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @Override
    @PostMapping("/delete")
    public CommonDTO delete(MaterialInfo data) {
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
     * @api {get} /materials/list 分页获取资料
     * @apiGroup Material
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
    public CommonDTO list(MaterialInfo data) {
        try{
            CommonDTO rt = CommonDTOUtil.success(service.listByPage(data));
            rt.setAllDataNum(service.countByExample(data));
            return rt;
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500,e.getMessage(),data);
        }
    }

    /**
     * @api {get} /materials/one 获取单个成果详情
     * @apiGroup Material
     * @apiParam {int} id 资料id
     * @apiSuccessExample Success-Request:
     * {}
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {}
     */
    @Override
    @GetMapping("/one")
    public CommonDTO one(MaterialInfo data) {
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
     * @api {get} /materials/pageByAuthor 按用户分页获取资料
     * @apiGroup Material
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
    "data": [],
    "allDataNum": 0
     * }
     */
    @Override
    @GetMapping("/pageByAuthor")
    public CommonDTO listByFilter(MaterialInfo data) {
        try{
            if (data.getAuthorId() == 0){
                return CommonDTOUtil.error(403,"请传入创建者id",data);
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
