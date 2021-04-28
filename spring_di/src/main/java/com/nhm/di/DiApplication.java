package com.nhm.di;

import com.nhm.di.controller.ConstructorInjectedController;
import com.nhm.di.controller.MyController;
import com.nhm.di.controller.PropertyInjectedController;
import com.nhm.di.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DiApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");
		System.out.println(myController.getGreetings());

		System.out.println("--Property DI--");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());

		System.out.println("--Constructor DI--");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());

		System.out.println("--Setter DI--");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());
	}

}
