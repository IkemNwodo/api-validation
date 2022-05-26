package com.example.apivalidation.dto;

import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "Name should not be null")
    private String name;
    @Email
    private String email;
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number entered")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;

}
