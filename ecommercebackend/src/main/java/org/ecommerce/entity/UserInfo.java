package org.ecommerce.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class UserInfo {
	@Id
	private int id;
	private String name;
	private String email;
	private String password;
	private String role;

}
