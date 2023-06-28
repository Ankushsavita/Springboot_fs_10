package com.geekster.User.Management.System.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull
    private Integer userId;

    @NotBlank(message = "name can not be blank")
    private String userName;

    @Pattern(regexp = "\\d{2}-\\d{2}-\\d{4}", message = "Date of birth should be in the format dd-mm-yyyy")
    private String dateOfBirth;

    @Email(message = "Given email id is invalid")
    private String email;

    @Pattern(regexp = "\\d{2}\\d{10}", message = "Phone number should be in the format CCXXXXXXXXXX")
    private String phoneNumber;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date must be in the format yyyy-MM-dd")
    private String date;

    @Pattern(regexp = "\\d{2}:\\d{2}", message = "Time must be in the format HH:mm")
    private String time;
}
