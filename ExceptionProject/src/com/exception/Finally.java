package com.exception;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		try
		{
			sc=new Scanner(System.in);
			int[] c= {1,2};
			int number=c[4];
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(sc!=null)
			{
				System.out.println("it is closed");
				sc.close();
			}
			
		}
	}

}
