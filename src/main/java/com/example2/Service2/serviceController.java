package com.example2.Service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")



public class serviceController {
@GetMapping
public String test1() {
	return "this is controller from test1";
}
@GetMapping("/getTest")
public String getTest() {
	String url = "/service1";
	return "this is from service1 in test1";
}

}
