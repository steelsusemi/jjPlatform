package com.jjplatform.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jjplatform.admin.dao.UserAuthDAO;

@Service("customUserDetailsServiceImpl")
public class CustomUserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
    private UserAuthDAO userAuthDAO;
 
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userAuthDAO.loadUserByUsername(username);
    }

}
