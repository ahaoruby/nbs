package com.xiaohaoz.nbs.newstarblog.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
  * Catalog 实体
  * @author : zxh
  * @version : 1.0
  * @since : 2020/3/23 14:27
  **/
@Data
@Entity
public class Catalog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min=2, max=30)
	@Column(nullable = false)
	private String name;
 
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
 
 
}
