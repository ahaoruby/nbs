package com.xiaohaoz.nbs.newstarblog.service;

import com.xiaohaoz.nbs.newstarblog.domain.Authority;
import com.xiaohaoz.nbs.newstarblog.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  * Authority 服务
  * @author : zxh
  * @version : 1.0
  * @since : 2020/3/23 16:58
  **/
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.getById(id);
	}

}
