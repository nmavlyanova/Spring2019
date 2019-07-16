package day45;

import day44.MathEquation;

public class MathEquationSolving2 {

	public static void main(String[] args) {

		MathEquation m2= new MathEquation(25.0,32.0,'*');
		MathEquation m3= new MathEquation(52.6,55.0,'+');
		MathEquation m4= new MathEquation(10.0,8,'-');
		
		m2.Calculate();
		System.out.println(m2.getResult());
		
		m2.calculateX(55, 5);
		System.out.println(m2.getResult());
		
		m3.Calculate();
		System.out.println(m3.getResult());
		
		
	}

}
