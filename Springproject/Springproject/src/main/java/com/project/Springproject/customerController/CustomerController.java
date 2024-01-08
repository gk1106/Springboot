package com.project.Springproject.customerController;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

	@PostMapping(path="/save")
	public String saveCustomer(@RequestBody customerDto)
	{
		
	}
}
