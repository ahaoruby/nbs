package com.xiaohaoz.nbs.newstarblog.domain;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
  * 权限
  * @author : zxh
  * @version : 1.0
  * @since : 2020/3/23 14:15
  **/
@Data
@Entity
public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	/**
	 * 获取权限
	 *
	 * @param :
	 * @return : java.lang.String
	 * @author : zxh
	 * @version : 1.0
	 * @since 2020/3/23 14:24
	 **/
	@Override
	public String getAuthority() {
		return name;
	}
}
