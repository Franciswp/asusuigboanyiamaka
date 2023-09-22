package com.asusuigbo.asusuigboanyiamaka.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @Table(name = "contact_msg")
public class Contact extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    @NotBlank(message = "Enter your name please")
    @Size(min = 3,message = "Name must be at least 3 characters long")
    private String name;

    //@Pattern(regexp = "(^$/[0-9]{10})",message = "Mobile number must be 10 digits")
    //@NotBlank(message = "Enter your phone number")
    private String mobileNum;

    //@Email(message = "Please provide a valid email")
    @NotBlank(message = "Email must not be blank")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Invalid email format")
    private String email;

    //@Size(min = 5,message = "Please select at least on program")
    @NotBlank(message = "Please select at least 1 program")
    private String subject;

    @NotBlank(message = "Enter your message")
    @Size(min = 10,message = "Message must be at least 10 characters long")
    private String message;

    private String status;

}
