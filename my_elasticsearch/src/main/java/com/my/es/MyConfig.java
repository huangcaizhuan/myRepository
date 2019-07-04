package com.my.es;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;*/
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	
	  @Bean 
	  public TransportClient cleint() throws UnknownHostException { 
		  Settings settings = Settings.builder().put("cluster.name", "hcz-6.4.0").build();
	  
	  		PreBuiltTransportClient client = new PreBuiltTransportClient(settings);
	
	  		int[] local_ports = {9300, 9301, 9302}; 
	  		for (int port : local_ports) {
	  			client.addTransportAddress(new TransportAddress(
	  				InetAddress.getByName("localhost"), port )); 
	  			}
	  
	  return client;
	 }
	
//	@Bean
//	public RestClient client(){
//		RestClient restClient = RestClient.builder(
//		        new HttpHost("localhost", 9300, "http"),
//		        new HttpHost("localhost", 9301, "http"),
//		        new HttpHost("localhost", 9302, "http")).build();
//        return restClient;
//	}
}
