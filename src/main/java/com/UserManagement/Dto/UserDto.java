package com.UserManagement.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;

    @NotBlank(message = "First name should not be empty")
    @Size(min = 2, max = 50, message = "First name should be between 2 and 50 characters")
    private String firstName;

    @NotEmpty(message = "Last name should not be empty")
    private String lastName;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    @NotNull(message = "Password should not be empty")
    private String password;

    @Positive(message = "Age should be a positive number")
    @Max(value = 200, message = "Age should not exceed 200")
    private Integer age;

    @NotEmpty(message="Phone number should not be empty")
    @Pattern(regexp = "\\d{10}", message = "Phone number should have exactly 10 numbers")
    private String phone;

    @NotEmpty(message="Gender should not be empty")
    @Pattern(regexp = "^(Male|Female)$", message = "Gender must be either 'Male' or 'Female'")
    private String gender;

    @NotBlank(message = "Address should not be empty")
    @Size(min = 5, max = 100, message = "Address should be between 5 and 100 characters")
    private String address;

	
	private String role;
}
