/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.test.spring.security.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pengwei
 */
@Data
@Entity
@Table(name = "sys_model")
public class SysModel implements Serializable,GrantedAuthority {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "model_id")
    private Integer modelId;
    @Column(name = "model_code")
    private String modelCode;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "model_status")
    private Integer modelStatus;
    @Column(name = "role_id")
    private Integer roleId;

    @Override
    public String getAuthority() {
        return modelCode;
    }
}
