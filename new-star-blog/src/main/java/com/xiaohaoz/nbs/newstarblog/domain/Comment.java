package com.xiaohaoz.nbs.newstarblog.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;

/**
  * Comment 实体
  * @author : zxh
  * @version : 1.0
  * @since : 2020/3/23 14:28
  **/
@Data
@Entity
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min=2, max=500)
	@Column(nullable = false)
	private String content;
 
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(nullable = false) // 映射为字段，值不能为空
	@org.hibernate.annotations.CreationTimestamp  // 由数据库自动创建时间
	private Timestamp createTime;
 
	protected Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(User user, String content) {
		this.content = content;
		this.user = user;
	}
 
}
