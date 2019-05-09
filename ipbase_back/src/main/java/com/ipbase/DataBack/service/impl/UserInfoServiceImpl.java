package com.ipbase.DataBack.service.impl;

import com.ipbase.DataBack.dao.UserInfoMapper;
import com.ipbase.DataBack.entity.UserInfo;
import com.ipbase.DataBack.entity.example.UserInfoExample;
import com.ipbase.DataBack.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author tianyi
 * @date 2019-05-04 20:25
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper d;

    /**
     * 添加记录
     *
     * @param data
     * @return
     */
    @Override
    public int addSelective(UserInfo data) {
        return d.insertSelective(data);
    }

    /**
     * 更新记录
     *
     * @param data
     * @return
     */
    @Override
    public int updateSelective(UserInfo data) {
        UserInfoExample example = new UserInfoExample();
        example.or().andIdEqualTo(data.getId());
        return d.updateByExampleSelective(data, example);
    }

    /**
     * 删除记录(可单个可批量)
     *
     * @param data
     * @return
     */
    @Override
    public int delete(UserInfo data) {
        UserInfoExample example = new UserInfoExample();
        int id = data.getId();
        if (id != 0) {
            example.or().andIdEqualTo(id);
        }else {
            List ids = Arrays.asList(data.getIds());
            example.or().andIdIn(ids);
        }
        return d.deleteByExample(example);
    }

    /**
     * 分页获取列表
     *
     * @param data
     * @return
     */
    @Override
    public List<UserInfo> listByPage(UserInfo data) {
        UserInfoExample example = new UserInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());
        return d.selectByExample(example);
    }

    /**
     * 获取单个数据
     *
     * @param data
     * @return
     */
    @Override
    public UserInfo getOneById(UserInfo data) {
        UserInfoExample example = new UserInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        example.or().andIdEqualTo(data.getId());

        return d.selectByExample(example).get(0);
    }

    /**
     * 条件获取列表
     * 1. 名称模糊查询
     * 2. 账号精确查询
     * @param data
     * @return
     */
    @Override
    public List<UserInfo> listByObjectPage(UserInfo data) {
        UserInfoExample example = new UserInfoExample();
        data.setPageStart( data.getRows() * (data.getPage() - 1) );
        example.setPage(data.getPage());
        example.setPageStart(data.getPageStart());
        example.setRows(data.getRows());

        String account = data.getAccount();
        String name = data.getName();
        if (account != null && name != null) {
            example.or()
                    .andNameLike("%" + name + "%")
                    .andAccountEqualTo(account);
        }else if (name != null){
            example.or()
                    .andNameLike("%" + name + "%");
        }else if (account != null){
            example.or()
                    .andAccountEqualTo(account);
        }

        return d.selectByExample(example);
    }

    /**
     * 用户登录
     * @param data
     * @return
     * @throws Exception
     */
    @Override
    public UserInfo login(UserInfo data) throws Exception {
        UserInfoExample example = new UserInfoExample();

        String account = data.getAccount();
        String password = data.getPassword();
        example.or()
                .andAccountEqualTo(account);
        try {
            UserInfo user = d.selectByExample(example).get(0);
            if (user == null){
                throw new Exception("账号不存在");
            }else if (!user.getPassword().equals(password)){
                throw new Exception("密码不正确");
            }else {
                return user;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            throw new Exception("账号不存在");
        }catch (Exception e){
            throw e;
        }
    }
}
