package com.user.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.user.service.UserRem;

public class UserRemTest {
	static UserRem userem;
	

	public UserRemTest()
	{
		userem=new UserRem();
		System.out.println("working");
		
	}
	
	@BeforeAll
	public static void setUpBeforeClass()
	{
		System.out.println("Setting up an UserRem object!");
		userem=new UserRem();
		
	}
	
	@Test
	public void testUserRemainder()
	{
	
		userem= new UserRem();
		
		System.out.println("Testing userem creation of user");
		assertTrue(userem.setUserRemainder());
		
	}
	
//	public static void main(String args[])
//	{
//		System.out.println("Setting up an UserRem object!");
//		userem=new UserRem();
//		System.out.println("Class works fine");
//		User user = new User();
//		Remainder rem = new Remainder();
//		userem.setUserRemainder(user, rem);
//		
//	}
}


