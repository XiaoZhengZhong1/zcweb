package com.czweb.controller;
import com.czweb.pojo.SysRole;
import com.czweb.pojo.SysSeq;
import com.czweb.pojo.UserInfo;
import com.czweb.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;
@ResponseBody
@RequestMapping(method = RequestMethod.POST)
@Controller
public class CommController {

    //1:用户表
    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "selecUser2")
    public List<UserInfo> index2(Integer sqlId) {

        List<UserInfo> list = commonService.select2(sqlId);

        return list;
    }

    @RequestMapping(value = "selecUser3")
    public List<UserInfo> index3(Integer sqlId) {

        List<UserInfo> list = commonService.select2(sqlId);

        return list;
    }

    @RequestMapping(value = "selecUser4")
    public Map index4(Integer sqlId) {

        Map map = commonService.select4(sqlId);

        return map;
    }

    @RequestMapping(value = "selecUser5")
    public List<Map> index5(Integer sqlId) {

        List<Map> map = commonService.select5(sqlId);

        return map;
    }


    @RequestMapping(value = "deleteUser")
    public boolean deleteUser(Integer sqlId){
        System.out.println("------");
        System.out.println("------");
        System.out.println("------");
        return commonService.deleteUser(sqlId);

    }

    @RequestMapping(value = "insertUser")
    public boolean insertUser(UserInfo userInfo){

        return commonService.insertUser(userInfo);
    }

    @RequestMapping(value = "uqdateUser")
    public boolean alertUser(UserInfo userInfo){
        return commonService.uqdateUser(userInfo);
    }





    //2:角色表
    @RequestMapping("insertSysRole")
    public boolean insertSysRole(SysRole sysRole){

        return commonService.insertSysRole(sysRole);
    }


    @RequestMapping("deleteSysRole")
    public boolean deleteSysRole(String id){
        return commonService.deleteSysRole(id);
    }

    @RequestMapping("updateSysRole")
    public boolean updateSysRole(SysRole sysRole){
        return commonService.updateSysRole(sysRole);
    }

    @RequestMapping("selectSysRole")
    public List<Map> selectSysRole(String name){
        return commonService.selectSysRole(name);
    }





    //3:Sys_Seq表
    @RequestMapping("insertSysSeq")
    public boolean insertSysSeq(SysSeq sysSeq){
        return commonService.insertSysSeq(sysSeq);

    }


    @RequestMapping("deletiSysSeq")
    public boolean deleteSysSeq(String name){
        return commonService.deleteSysSeq(name);
    }


    @RequestMapping("updateSysSeq")
    public boolean updateSysSeq(SysSeq sysSeq){
        return commonService.updateSysSeq(sysSeq);
    }

    @RequestMapping("selectSysSeq")
    public List<Map> selectSysSeq(String name){

        return commonService.selectSysSeq(name);
    }
}
