package com.czweb.dao;
import com.czweb.pojo.SysRole;
import com.czweb.pojo.SysSeq;
import com.czweb.pojo.UserInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public interface CommDao {

	//1:用户表
	List<UserInfo> select2(Integer sqlId);

	List<UserInfo> select3(Integer sqlId);

	//返回单条数据
	Map select4(Integer sqlId);

	//返回多条数据
	List<Map> select5(Integer sqlId);

    int deleteUser(Integer sqlId);

	int insertUser(UserInfo userInfo);

	int uqdateUser(UserInfo userInfo);


	//2:角色表
	int insertSysRole(SysRole sysRole);

	int deleteSysRole(String id);

	List<Map> selectSysRole(String name);

	int updateSysRole(SysRole sysRole);

	//3:Sys_Seq表
	int insertSysSeq(SysSeq sysSeq);

	int deleteSysSeq(String name);

	int updateSysSeq(SysSeq sysSeq);

	List<Map> selectSysSeq(String name);
}
