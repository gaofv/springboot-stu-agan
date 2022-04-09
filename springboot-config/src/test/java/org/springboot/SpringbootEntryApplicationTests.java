package org.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootEntryApplicationTests {

	@Autowired
	private BeanFactory beanFactory;

	@Test
	void contextLoads() {
		Object personInfo = beanFactory.getBean("personInfo");
		System.out.println(personInfo);
	}

}
