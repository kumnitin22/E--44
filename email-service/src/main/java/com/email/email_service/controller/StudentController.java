package com.email.email_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	   @GetMapping("/student")
	   public String getStudent() {
		   return "Done All Student";
	   }
}
