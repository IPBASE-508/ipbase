package com.ipbase.DataBack.controller;

import com.ipbase.DataBack.config.PathConfig;
import com.ipbase.DataBack.dto.CommonDTO;
import com.ipbase.DataBack.utils.CommonDTOUtil;
import com.ipbase.DataBack.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-11 13:07
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private PathConfig pathConfig;

    /**
     * @apiDefine File 文件
     */

    /**
     *  @apiDefine CommonDTO
     *  @apiSuccess {Integer} resultCode 响应结果
     *  @apiSuccess {String} resultMsg 结果描述
     *  @apiSuccess {Object} data 数据主体
     */

    /**
     * @api {post} /file/mutiUpload/noName 批量上传，返回新文件名
     * @apiGroup File
     * @apiParam {file[]} file 多个文件（参数名需一样）
     * @apiSuccessExample Success-Request:
     * {
     *     // form-data
     *     file: 文件1
     *     file: 文件2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    "1557759632501.jpg",
    "1557759632503.jpg"
    ]
     * }
     */
    @PostMapping("/mutiUpload/noName")
    public CommonDTO mutiUpload(@RequestParam("file") MultipartFile[] files){
        List<String> rt = new ArrayList<String>();
        try {
            for(MultipartFile file : files){
                InputStream is = file.getInputStream();
                byte[] temp = new byte[is.available()];
                is.read(temp);
                is.close();
                String fileName = System.currentTimeMillis()
                        + FileUtil.getKind(file.getOriginalFilename());
                String filePath = pathConfig.getPictrueDir() + "/" + fileName;
                System.out.println("[no name upload]" + filePath);
                // FileUtil.saveFile(filePath, temp);
                rt.add(fileName);
            }
            return CommonDTOUtil.success(rt);
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

    /**
     * @api {post} /file/mutiUpload/withName 上传文件，保留原文件名
     * @apiGroup File
     * @apiParam {file[]} file 多个文件（参数名需一样）
     * @apiSuccessExample Success-Request:
     * {
     *     // form-data
     *     file: 文件1
     *     file: 文件2
     * }
     * @apiUse CommonDTO
     * @apiSuccessExample Success-Response:
     * {
     *     "resultCode": 200,
    "resultMsg": "成功",
    "data": [
    "japan50.jpg",
    "sihunzhiyu.png"
    ]
     * }
     */
    @PostMapping("/mutiUpload/withName")
    public CommonDTO withName(@RequestParam("file") MultipartFile[] files){
        List<String> rt = new ArrayList<String>();
        try {
            for(MultipartFile file : files){
                InputStream is = file.getInputStream();
                byte[] temp = new byte[is.available()];
                is.read(temp);
                is.close();
                String fileName = file.getOriginalFilename();
                String filePath = pathConfig.getPictrueDir() + "/" + fileName;
                System.out.println("[upload with name]" + filePath);
                // FileUtil.saveFile(filePath, temp);
                rt.add(fileName);
            }
            return CommonDTOUtil.success(rt);
        }catch (Exception e){
            e.printStackTrace();
            return CommonDTOUtil.error(500, e.getMessage());
        }
    }

}
