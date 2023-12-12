package com.gabodev.bankmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.swing.*;

@SpringBootApplication
public class BankManagementSystemApplication extends JFrame {

	public static void main(String[] args) {
		SpringApplication.run(BankManagementSystemApplication.class, args);
		new Login();
		System.out.print("WORKING");

	}

}
