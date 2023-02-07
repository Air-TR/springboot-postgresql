package com.tr.springboot.postgresql;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootPostgresqlApplicationTests {

	@Autowired
	private UserInfoRepository userRepository;

	@Test
	public void test() throws Exception {
		// 创建10条记录
		userRepository.save(new UserInfo("AAA", 10));
		userRepository.save(new UserInfo("BBB", 20));
		userRepository.save(new UserInfo("CCC", 30));
		userRepository.save(new UserInfo("DDD", 40));
		userRepository.save(new UserInfo("EEE", 50));
		userRepository.save(new UserInfo("FFF", 60));
		userRepository.save(new UserInfo("GGG", 70));
		userRepository.save(new UserInfo("HHH", 80));
		userRepository.save(new UserInfo("III", 90));
		userRepository.save(new UserInfo("JJJ", 100));
		// 测试 findAll, 查询所有记录
		Assertions.assertEquals(10, userRepository.findAll().size());
		// 测试 findByName, 查询姓名为FFF的User
		Assertions.assertEquals(60, userRepository.findByName("FFF").getAge().longValue());
		// 测试 findUser, 查询姓名为 FFF 的 User
		Assertions.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());
		// 测试 findByNameAndAge, 查询姓名为 FFF 并且年龄为 60 的 User
		Assertions.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());
		// 测试删除姓名为 AAA 的 User
		userRepository.delete(userRepository.findByName("AAA"));
		// 测试 findAll, 查询所有记录, 验证上面的删除是否成功
		Assertions.assertEquals(9, userRepository.findAll().size());
	}

}
