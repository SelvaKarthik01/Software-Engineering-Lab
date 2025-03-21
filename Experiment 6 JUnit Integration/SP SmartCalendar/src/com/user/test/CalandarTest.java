package com.user.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.user.service.User;

public class CalandarTest {
	static User user;
	
	@BeforeAll
	public static void setUpBeforeClass()
	{
		System.out.println("Setting up an User object! with values 27, 2772, sp, sp27pluto@gmail.com");
		user=new User();
		
	}
	
	@Test
	public void testRegister()
	{
		System.out.println("Testing registration of user sp with user id 28");
		assertEquals(true,user.register(28, 2772, "sp27", "sp27pluto@gmail.com"));
		System.out.println("Testing registration of user selva with user id 28");
		assertEquals(false,user.register(28, 2882, "selva", "selva@gmail.com"));
	}
	
	@Test
	public void testLogin()
	{
		user.register(27, 2772, "sp", "sp27pluto@gmail.com");
		System.out.println("Testing login of user sp with user id 27");
		assertFalse(user.login(27, 2772));
		System.out.println("Testing login of user selva with user id 28");
		assertTrue(user.login(28, 2882));
	}
	
	@Test
	public void testLogout()
	{
		user.logout(27);
		System.out.println("Testing logout of user with user id 27");
		assertFalse(user.logout(27));
		System.out.println("Testing logout of user with user id 28");
		assertTrue(user.logout(28));
	
	}
	

}