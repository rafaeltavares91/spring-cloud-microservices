package com.photoapp.api.users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private String userId;

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String encryptedPassword;
	
}
