package day36;

import java.util.Arrays;

public class WrapperClasses {

	public static void main(String[] args) {
		
		Boolean b=new Boolean(true);
		Boolean b1=new Boolean("true");
		Boolean b2=Boolean.valueOf(true);
		Boolean b3=Boolean.valueOf("true");
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		Character ch= new Character('c');
		Character ch1=Character.valueOf('c');
		System.out.println(ch);
		System.out.println(ch1.toString());		
		
		
		Byte bt=new Byte((byte)123);
		Byte bt1=new Byte("123");
		Byte bt2=Byte.valueOf((byte)123);
		Byte bt3=Byte.valueOf("123");
		
		
		Short sh=new Short((short)123);
		Short sh1=new Short("123");
		
		
		
		Integer i = new Integer (1200);
		Integer i1= new Integer ("1200");
		Integer i2= Integer.valueOf(1200);
		Integer i3= Integer.valueOf("1200");
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

	}

}
