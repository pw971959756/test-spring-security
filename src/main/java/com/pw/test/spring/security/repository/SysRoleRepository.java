package com.pw.test.spring.security.repository;

import com.pw.test.spring.security.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysRoleRepository extends JpaRepository<SysRole,Integer> {
}
