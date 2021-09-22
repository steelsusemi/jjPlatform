package com.jjplatform.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.jjplatform.admin.vo.CustomUserDetails;

@Repository("userAuthDAO")
public class UserAuthDAO {
	
	private String NAME_SPACE = "com.jjplatform.admin.dao.userAuthDAO.";
	
	@Autowired
    private SqlSessionTemplate sqlSession;
 
    public CustomUserDetails loadUserByUsername(String username) {
        return sqlSession.selectOne(NAME_SPACE + "selectUserById", username);
    }
}
