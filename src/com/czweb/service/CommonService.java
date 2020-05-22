package com.czweb.service;
import com.czweb.pojo.SysRole;
import com.czweb.pojo.SysSeq;
import com.czweb.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public interface CommonService {

    //1:用户表
    public List<UserInfo> select2(Integer sqlId);

    public List<UserInfo> select3(Integer sqlId) ;

    public Map select4(Integer sqlId);

    public List<Map> select5(Integer sqlId);

    public boolean  deleteUser(Integer sqlId);

    public boolean insertUser(UserInfo userInfo);

    public boolean uqdateUser(UserInfo userInfo);


    //2:角色表
    boolean insertSysRole(SysRole sysRole);

    boolean deleteSysRole(String id);

    List<Map> selectSysRole(String name);

    boolean updateSysRole(SysRole sysRole);


    //3:Sys_Seq表
    boolean insertSysSeq(SysSeq sysSeq);

    boolean deleteSysSeq(String name);

    boolean updateSysSeq(SysSeq sysSeq);

    List<Map> selectSysSeq(String name);

}
