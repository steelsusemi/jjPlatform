package com.jjplatform.admin.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
@SuppressWarnings({ "unused", "serial" })
public abstract class CustomUserDetails implements UserDetails{
	
	private String userId;
    private String userPass;
    private String authority;
    private boolean enabled;
    private String userNm;
    
    // 계정이 갖고있는 권한 목록을 리턴한다.
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
        auth.add(new SimpleGrantedAuthority(authority));
        return auth;
    }
 
    // 계정이 만료되지 않았는 지 리턴한다. (true: 만료안됨)
    public boolean isAccountNonExpired() {
        return true;
    }
    
    // 계정이 잠겨있지 않았는 지 리턴한다. (true: 잠기지 않음)
    public boolean isAccountNonLocked() {
        return true;
    }
 
    // 비밀번호가 만료되지 않았는 지 리턴한다. (true: 만료안됨)
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    // 계정이 활성화(사용가능)인 지 리턴한다. (true: 활성화)
    public boolean isEnabled() {
        return enabled;
    }
}
