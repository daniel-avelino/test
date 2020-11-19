package com.example.curso1.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import com.example.curso1.entities.Order;
import com.example.curso1.entities.OrderItem;
import com.example.curso1.entities.Products;
import com.example.curso1.entities.User;
import com.example.curso1.repositories.CepRepository;
import com.example.curso1.repositories.OrderItemRepository;
import com.example.curso1.repositories.OrderRepository;
import com.example.curso1.repositories.ProductRepository;
import com.example.curso1.repositories.UserRepository;

@Configuration
@Profile("test")
public class Test implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private CepRepository cepRepository;
	@Override
	public void run(String... args) throws Exception {
		
		/* User u1 = new User(null,"Daniel");
		User u2 = new User(null,"Danieli");
		User u3 = new User(null,"Daniele");


		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
		
		Products product = new Products(null, "Notebook", 3500.00);
		Products product2 = new Products(null, "TV", 2500.00);


		productRepository.saveAll(Arrays.asList(product,product2));
		
		Order o1 = new Order(null,u1);
		
		orderRepository.save(o1);
		
		OrderItem oi1 = new OrderItem(o1,product,2,7000.00);
		OrderItem oi2 = new OrderItem(o1,product2,2,5000.00);
		
		orderItemRepository.saveAll(Arrays.asList(oi1,oi2)); */

		
		RestTemplate template = new RestTemplate();
		
		String uri = "http://viacep.com.br/ws/{cep}/json";
				
		Map<String,String> params = new HashMap<>();
		params.put("cep", "86191800");
			Cep cep = template.getForObject(uri, Cep.class, params);
			
			cepRepository.save(cep);
			System.out.print(cep.toString());
	}

	
}
