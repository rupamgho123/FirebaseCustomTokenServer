package com.foodvite.firebaseadmin.demo;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		FileInputStream serviceAccount =
				null;
		try {
			serviceAccount = new FileInputStream("src/main/resources/foodvite.json");
			FirebaseOptions options = new FirebaseOptions.Builder()
					.setServiceAccount(serviceAccount)
					.setDatabaseUrl("https://fir-demoappfoodvite-927b5.firebaseio.com")
					.build();

			FirebaseApp.initializeApp(options);
		} catch (FileNotFoundException e) {
			System.out.println("json not found");
			e.printStackTrace();
		}
	}
}
