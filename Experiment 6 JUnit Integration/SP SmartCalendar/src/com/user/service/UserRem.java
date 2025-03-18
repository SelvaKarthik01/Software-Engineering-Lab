package com.user.service;

public class UserRem {
	User user;
	Remainder rem;

	public UserRem()
	{
		System.out.println("constructor");
		user= new User();
		rem =new Remainder();
	}
	public boolean setUserRemainder()
	{
		if(user.register(27, 2772, "sp","my@gmail.com") && user.login(27, 2772) && rem.setRemainder("MyBirthday",20,8, 0))
			{System.out.println("User registered, login success and remainder set!");
		
			return true;
		}
		else
		{
			
			System.out.println("Error registering user sp or logining or setting remainder!");
			return false;
		}
		
	}
}
