package com.jjplatform.admin.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jjplatform.admin.vo.CustomUserDetails;

public interface CustomUserDetailsService {
 
    CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
