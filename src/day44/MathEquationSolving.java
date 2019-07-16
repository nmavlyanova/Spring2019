package day44;

public class MathEquationSolving {

	public static void main(String[] args) {
	
		MathEquation m1= new MathEquation();
		
		MathEquation m2= new MathEquation(25.0,32.0,'*');
		MathEquation m3= new MathEquation(52.6,55.0,'+');
		MathEquation m4= new MathEquation(10.0,8,'-');
		m2.Calculate();
		m3.Calculate();
		m4.Calculate();
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);

	}

}
