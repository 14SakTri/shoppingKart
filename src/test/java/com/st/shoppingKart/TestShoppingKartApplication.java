package com.st.shoppingKart;

import org.springframework.boot.SpringApplication;

public class TestShoppingKartApplication {

	public static void main(String[] args) {
		SpringApplication.from(ShoppingKartApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
