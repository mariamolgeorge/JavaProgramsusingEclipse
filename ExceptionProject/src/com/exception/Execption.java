package com.exception;

public class Execption {
	public static void main(String[] args) {
		System.out.println("hai");
		Data d=new Data();
		d.data1();
		System.out.println("main ended");
	}
	

}
class Data
{
	public void data1()
	{
		
		data2();
		System.out.println("data2length"+("data1".length()));
	}
	public void data2()
	{
		data();
		System.out.println("data3length"+("data2".length()));
	}
	public void data()
	{
		try
		{
		String a=null;
		System.out.println("data is"+"hai".length());
		System.out.println("data is"+a.length());
		System.out.println("data is"+"hai".length());
		}
		catch(NullPointerException e1)
		{
			System.out.println("NullPointerException is:"+e1);

		}
		catch(Exception e)
		{
//			System.out.println("Exception is"+e);
			e.printStackTrace();
		}
	}
}
