package com.jjplatform.admin.vo;

import lombok.Data;

@Data
public class UserVo {
	private String userId;
    private String userPass;
    private String authority;
    private String userNm;
}
