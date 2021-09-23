package com.jjplatform.admin.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jjplatform.admin.vo.CustomUserDetails;
import com.jjplatform.admin.vo.UserVo;

@Repository
public class UserAuthDAO {
	
	private String NAME_SPACE = "com.jjplatform.admin.dao.UserAuthDAO.";
	
	@Autowired
    private SqlSessionTemplate sqlSession;
 
    public List<UserVo> loadUserByUsername(String username) {
        return sqlSession.selectList(NAME_SPACE + "selectUserById", username);
    }
}
