package com.dormitory.Dao;


import com.dormitory.model.po.SuperAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by war on 2017/4/17.
 */
@Repository
public interface SuperAdminMapper {
    SuperAdmin selectSuperAdminById(@Param("id") int id);  //根据id查询超管信息
    SuperAdmin selectSuperAdminByUsername(@Param("username") String username);
    void insertSuperAdmin(SuperAdmin superAdmin);  //插入超管信息
    void deleteSuperAdmin(@Param("username") String username);  //删除超管信息
}