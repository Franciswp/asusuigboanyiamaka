package com.asusuigbo.asusuigboanyiamaka.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Contact {
    @NotBlank(message = "Enter your name please")
    @Size(min = 3,message = "Name must be at least 3 characters long")
    private String name;

    //@Pattern(regexp = "(^$/[0-9]{10})",message = "Mobile number must be 10 digits")
    //@NotBlank(message = "Enter your phone number")
    private String mobileNum;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Please provide a valid email")
    private String email;

    //@Size(min = 5,message = "Please select at least on program")
    @NotBlank(message = "Please select at least 1 program")
    private String subject;

    @NotBlank(message = "Enter your message")
    @Size(min = 10,message = "Message must be at least 10 characters long")
    private String message;


}
