package com.photoapp.api.users.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestModel {

	@NotNull(message="First name cannot be null")
	@Size(min=2, message="First name cannot be less than two caracteres")
	private String firstName;
	
	@NotNull(message="Last name cannot be null")
	@Size(min=2, message="Last name cannot be less than two caracteres")
	private String lastName;
	
	@NotNull(message="Email cannot be null")
	@Email
	private String email;
	
	@NotNull(message="Password cannot be null")
	@Size(min=6, max=32, message="The password must be greater than 6 caracters and less than 32 caracters")
	private String password;
	
}
