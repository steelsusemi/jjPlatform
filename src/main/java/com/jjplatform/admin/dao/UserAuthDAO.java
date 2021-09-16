package com.jjplatform.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository("userAuthDAO")
public class UserAuthDAO {
	
	@SuppressWarnings("unused")
	private String NAME_SPACE = "user.";
	
	@Autowired
    private SqlSessionTemplate sqlSession;
 
    public UserDetails loadUserByUsername(String username) {
        return sqlSession.selectOne("user."+ "selectUserById", username);
    }
}
