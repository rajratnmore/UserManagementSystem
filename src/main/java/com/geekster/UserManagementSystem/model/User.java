package com.geekster.UserManagementSystem.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;
    private String userName;
    private Date userDateOfBirth;
    @Email(message = "Invalid email address format")
    private String userEmail;
    @Pattern(regexp = "^[0-9]{12}$", message = "Phone number must have exactly 12 digits")
    private String userPhoneNumber;
    private LocalDateTime userDateTime;

}
