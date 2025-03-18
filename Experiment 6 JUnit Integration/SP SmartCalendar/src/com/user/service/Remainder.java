package com.user.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Remainder {
	
	String remname;
	int hrs;
	int mins;
	int secs;
	List<Remainder> remList = new ArrayList<>(); 
	
	public Remainder(String remname, int hrs, int mins, int secs) {
		this.remname = remname;
		this.hrs = hrs;
		this.mins = mins;
		this.secs = secs;
	}
	
	public Remainder() {
		this.remname = "";
		this.hrs = 0;
		this.mins = 0;
		this.secs = 0;
	}
	
	public boolean setRemainder(String remname,int hrs, int mins, int secs) {
		if( hrs <24 && hrs>=0 && mins<=59 && mins>=0 && secs<=59 && secs>=0)
		{
			Remainder rem1 = new Remainder(remname, hrs, mins, secs);
			remList.add(rem1);
			
			int f=0;
			for(Remainder r : remList)
			{
				if(r.remname.equals(remname) && r.hrs==hrs && r.mins==mins && r.secs==secs)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
			System.out.println("Remainder set Successfully!");
			return true;
			}
			else
			{
				System.out.println("Event with the name and time already exists!");
				return false;
			}
		}
		
		System.out.println("Wrong Time inputs! Remainder setting failed!");
		return false;
	}

	//Yet to complete other methods

	public boolean calculate(String remname) {
		int hrs = LocalDateTime.now().getHour();
		int mins=LocalDateTime.now().getMinute();
		int secs=LocalDateTime.now().getSecond();
		if( hrs <24 && hrs>=0 && mins<=59 && mins>=0 && secs<=59 && secs>=0)
		{
			
			
			int f=0;
			for(Remainder r : remList)
			{
				if(r.remname.equals(remname))
				{
					
					if( r.hrs-hrs>0 || (r.hrs-hrs==0 && r.mins-mins>0) || (r.hrs-hrs==0 && r.mins-mins==0 && r.secs-secs >0))
					{
						f=1;
						System.out.println("Found a remainder with name:"+remname+"at "+r.hrs+":"+r.mins+":"+r.secs+"\nTime remaining until the remainder:");
						System.out.println( "Hours: "+Math.abs( r.hrs - hrs) );
						System.out.println( "Minute: "+Math.abs( r.mins - mins) );
						System.out.println( "Seconds: "+Math.abs( r.secs - mins) );
						break;
					}
					else
					{
						System.out.println("Remainder with name found but the Event is already over!! No time remaining!");
						return false;
					}
				}
			}
			if(f==0)
			{
			System.out.println("Remainder with name: "+remname+" Not found!");
			return false;
			}
			else
			{
				System.out.println("Time until remainder calculation successful!");
				return true;
			}
		}
		
		System.out.println("Calculation success!");
		return true;
	}
	
//	  public static void main(String[] args) {
//		System.out.println(  LocalDateTime.now().getHour());
//		 System.out.println(LocalDateTime.now().getMinute());
//		 System.out.println(LocalDateTime.now().getSecond());
//	}


}