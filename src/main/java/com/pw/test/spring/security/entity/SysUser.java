/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.test.spring.security.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pengwei
 */
@Data
@Entity
@Table(name = "sys_user")
public class SysUser implements Serializable ,UserDetails {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_login_name")
    private String userLoginName;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "client_id")
    private Integer clientId;
    @Column(name = "user_status")
    private Integer userStatus;

    @Transient
    private List<SysRole> roiles = new ArrayList<>();
    @Transient
    private List<SysModel> models = new ArrayList<>();

//    authorities

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return models;
    }




    @Override
    public String getPassword() {
        return this.userPassword;
    }

    @Override
    public String getUsername() {
        return this.userLoginName;
    }

    @Override
    public boolean isAccountNonExpired() {  //指示用户的帐户是否已过期。
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {//指示用户是锁定还是解锁。
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {//指示用户的凭证（密码）是否已过期。
        return true;
    }

    @Override
    public boolean isEnabled() {    //指示用户是启用还是禁用。
        return true;
    }


    public List<SysRole> getRoiles() {
        return roiles;
    }

    public void setRoiles(List<SysRole> roiles) {
        this.roiles = roiles;
    }

    public List<SysModel> getModels() {
        return models;
    }

    public void setModels(List<SysModel> models) {
        this.models = models;
    }
}
