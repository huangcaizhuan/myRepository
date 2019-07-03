package com.my.es;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyElasticsearchApplication {
	
	@Autowired
	private TransportClient client;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	//查询接口
	@GetMapping("/get/book")
	public ResponseEntity get(@RequestParam(name="id",defaultValue = "")String id) {
		GetResponse response = client.prepareGet("book", "novel", id).get();
		if(!response.isExists()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(response.getSource(),HttpStatus.OK);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyElasticsearchApplication.class, args);
	}

}
