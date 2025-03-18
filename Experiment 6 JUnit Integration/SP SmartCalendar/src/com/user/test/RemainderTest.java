package com.user.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.user.service.Remainder;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.user.service.User;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.user.service.User;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.user.service.User;

import static org.junit.jupiter.api.Assertions.*;


public class RemainderTest {
	static Remainder rem;
	
	@BeforeAll
	public static void setUpBeforeClass()
	{
		System.out.println("Setting up a Remainder with values MyBirthday at 14hrs 40mins 27secs");
		rem=new Remainder();
		
	}
	
	@Test
	public void testSetRemainder()
	{
		System.out.println("Testing Setting up of remainder MyBirthday at 14hrs 40mins 27secs... ");
		assertEquals(true,rem.setRemainder("MyBirthday",14,40,27));
		System.out.println("Testing Setting up of remainder SelvaBirthday at 26hrs 67mins 0secs... ");
		assertEquals(true,rem.setRemainder("SelvaBirthday",26,67,0));
	}
	
	@Test
	public void testCalculate()
	{
		System.out.println("Testing remaining time calculation until an already set remainder with remainder name MyBirthday");
		assertEquals(true,rem.calculate("MyBirthday"));
		System.out.println("Testing remaining time calculation until an already set remainder with remainder name SelvaBirthday");
		assertEquals(true,rem.calculate("SelvaBirthday"));
	}
	
	

}