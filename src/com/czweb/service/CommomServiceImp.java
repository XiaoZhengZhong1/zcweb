package com.czweb.service;

import com.czweb.dao.CommDao;
import com.czweb.pojo.SysRole;
import com.czweb.pojo.SysSeq;
import com.czweb.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class CommomServiceImp implements CommonService {

    //1:用户表
    @Autowired
    private CommDao commDao;

    public List<UserInfo> select2(Integer sqlId) {
        return commDao.select2(sqlId);
    }

    public List<UserInfo> select3(Integer sqlId) {
        return commDao.select3(sqlId);
    }

    public Map select4(Integer sqlId) {
        return commDao.select4(sqlId);
    }

    public List<Map> select5(Integer sqlId) {
        return commDao.select5(sqlId);
    }


    public boolean  deleteUser(Integer sqlId) {

        return commDao.deleteUser(sqlId) > 0 ? true:false;


    }

    public boolean insertUser(UserInfo userInfo) {
        return commDao.insertUser(userInfo) > 0 ? true : false;
    }

    public boolean uqdateUser(UserInfo userInfo) {
        return commDao.uqdateUser(userInfo)> 0 ? true : false;
    }



    //2:角色表
    @Override
    public boolean insertSysRole(SysRole sysRole) {
        return commDao.insertSysRole(sysRole) > 0 ? true : false;
    }

    @Override
    public boolean deleteSysRole(String id) {
        return commDao.deleteSysRole(id) > 0 ? true : false;
    }

    @Override
    public List<Map> selectSysRole(String name) {
        return commDao.selectSysRole(name);
    }

    @Override
    public boolean updateSysRole(SysRole sysRole) {
        return commDao.updateSysRole(sysRole) > 0 ? true : false;
    }


    //3:Sys_Seq表
    @Override
    public boolean insertSysSeq(SysSeq sysSeq) {
        return commDao.insertSysSeq(sysSeq) > 0 ? true : false;

    }

    @Override
    public boolean deleteSysSeq(String name) {

        return commDao.deleteSysSeq(name) > 0 ? true : false;
    }

    @Override
    public boolean updateSysSeq(SysSeq sysSeq) {

        return commDao.updateSysSeq(sysSeq) > 0 ? true : false;
    }

    @Override
    public List<Map> selectSysSeq(String name) {

        return commDao.selectSysSeq(name);
    }
}
