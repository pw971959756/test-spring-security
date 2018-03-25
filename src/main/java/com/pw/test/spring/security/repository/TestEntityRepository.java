package com.pw.test.spring.security.repository;

import com.pw.test.spring.security.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resources;


public interface TestEntityRepository extends JpaRepository<TestEntity,Integer> {



}
