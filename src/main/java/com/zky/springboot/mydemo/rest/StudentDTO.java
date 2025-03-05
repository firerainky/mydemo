package com.zky.springboot.mydemo.rest;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentDTO {

    private String firstName;
    private String lastName;
}
