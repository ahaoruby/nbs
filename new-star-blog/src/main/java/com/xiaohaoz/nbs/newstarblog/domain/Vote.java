package com.xiaohaoz.nbs.newstarblog.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
  * Like 实体
  * @author : zxh
  * @version : 1.0
  * @since : 2020/3/23 15:10
  **/
@Data
@Entity
public class Vote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(nullable = false)
	@org.hibernate.annotations.CreationTimestamp
	private Timestamp createTime;
 
}
