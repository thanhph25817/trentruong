package com.example.demo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Student {
    @NotBlank(message = "khong de trong email")
    @Email(message = "khong dung dinh dang")
    String email;
    @NotBlank(message = "khong de trong ten")
    String fullName;
    @NotNull(message = "khong de trong ")
    @Max(value = 10, message = "khong qua 10")
    Double marks;
    @NotNull(message = "khong de trong gioi tinh")
    Boolean gender;
    @NotBlank(message = "khngo de trpng ten nuoc")
    String contry;
}
