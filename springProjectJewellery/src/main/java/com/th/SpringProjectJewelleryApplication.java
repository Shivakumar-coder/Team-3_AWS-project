package com.th;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.th.dto.Jewellery;
import com.th.dto.UserSignUp;
import com.th.services.JewelleryService;
import com.th.services.UserService;

@SpringBootApplication
public class SpringProjectJewelleryApplication implements CommandLineRunner{
	
	public static final Log LOGGER = LogFactory.getLog(SpringProjectJewelleryApplication.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private JewelleryService jewelleryService;
	
	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectJewelleryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		addUser();
		addJewellery();
		
	}
	public void addUser() {
		try {
			UserSignUp user=new UserSignUp();
			user.setFirstName("Shivakumar");
			user.setLastName("Hombal");
			user.setContactNo(7892616189L);
			user.setEmailId("abc@xyz.com");
			user.setPassword("abc123");
			
			Integer userId=userService.addUser(user);
			LOGGER.info("\n" + environment.getProperty("UserInterface.USER_ADDED") + userId);
		}catch (Exception e) {
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}
	}
	
	public void addJewellery() {
		try {
			Jewellery j=new Jewellery();
			j.setJewelType("Ring");
			j.setMetal("Gold");
			j.setWeight(2.0f);
			j.setPrice(10000.00f);
			
			Integer jewelId=jewelleryService.addJewellery(j);
			LOGGER.info("\n"+environment.getProperty("UserInterface.Jewellery_ADDED")+jewelId);
		}catch(Exception e){
			String message = environment.getProperty(e.getMessage(),
					"Some exception occured. Please check log file for more details!!");

			LOGGER.info(message);
		}
	}
}
