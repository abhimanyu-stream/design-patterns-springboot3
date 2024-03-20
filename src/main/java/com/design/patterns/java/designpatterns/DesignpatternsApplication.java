package com.design.patterns.java.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

		SpringApplication.run(DesignpatternsApplication.class, args);

		SingletonDesignPattern singletonDesignPattern1 = SingletonDesignPattern.getInstance();
		System.out.println(singletonDesignPattern1.hashCode());
		SingletonDesignPattern singletonDesignPattern2 = SingletonDesignPattern.getInstance();
		System.out.println(singletonDesignPattern2.hashCode());



		/**
		 * Trying to break Singleton Pattern
		 * 1. Reflection API
		 * Solution : throw exception from constructor or use ENUM
		 *
		 * 2. Serialization Deserialization
		 * Solution: readResolve() implement, its get called during Deserialization
		 * 3. Cloning
		 * Solution return same existing object from clone method
		 *
		 *
		 *
		 * */
		Constructor<?> constructor = SingletonDesignPattern.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonDesignPattern singletonDesignPattern3 = (SingletonDesignPattern) constructor.newInstance();
		System.out.println(singletonDesignPattern3);
		System.out.println(singletonDesignPattern3.hashCode());




	}

}
