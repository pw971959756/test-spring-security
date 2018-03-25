package com.pw.test.spring.security.repository;

import com.pw.test.spring.security.entity.SysUser;
import com.pw.test.spring.security.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository  extends JpaRepository<SysUser,Integer> {

    SysUser findByUserLoginName(String loginName);

}
