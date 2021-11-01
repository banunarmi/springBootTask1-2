package com.example.demo;


import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
@RequestMapping("/Hello")
		public Map<String,String>hello(){

		//public String hello(){
		
			Map<String,String> map = new HashMap<String,String>();
			map.put("message","Hello");
			return map;
			
			//return "Hello";	
		}


@GetMapping("/Sample")
		public ResponseEntity<Object> sample(){
			
			return ResponseEntity.ok("This is my first Example");
				
		}


@GetMapping("/Student")
public ResponseEntity<Object> getStudent(){
	Student student= new Student();
	student.setAddress("trincomalee");
	student.setAge("26");
	student.setName("Narmatha");
	student.setCode(ResponseStatus.BADREQUEST.getCode());
	student.setStatus(ResponseStatus.SUCCESS.getStatus());
	return ResponseEntity.ok(student);
			
}



}
