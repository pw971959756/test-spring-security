package com.pw.test.spring.security.repository;

import com.pw.test.spring.security.entity.SysModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysModelRepository extends JpaRepository<SysModel,Integer> {
}
