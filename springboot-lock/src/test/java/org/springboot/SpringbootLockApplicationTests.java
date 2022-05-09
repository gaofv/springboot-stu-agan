package org.springboot;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springboot.dao.ApplicationInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("org.springboot.dao")
class SpringbootLockApplicationTests {
	@Autowired
	private ApplicationInfoDao applicationInfoDao;

	@Test
	void contextLoads() {
		System.out.println(applicationInfoDao.selectList(""));
	}

}
