package com.pw.test.spring.security.service.impl;

import com.pw.test.spring.security.entity.SysModel;
import com.pw.test.spring.security.entity.SysUser;
import com.pw.test.spring.security.repository.SysModelRepository;
import com.pw.test.spring.security.repository.SysUserRepository;
import com.pw.test.spring.security.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Service("sysUserService")
@Configurable
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserRepository userRepository;
    @Autowired
    private SysModelRepository modelRepository;

//    attemptAuthentication



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<SysUser> all = userRepository.findAll();
        SysUser user = all.get(0);
        user.setModels(modelRepository.findAll());
        return user;
    }
}
