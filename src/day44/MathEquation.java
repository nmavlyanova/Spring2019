package day44;

public class MathEquation {

	
	private double oprand1;
	private double oprand2;
	private double result;
	private char operator;
	
	public double getOprand1() {
		return oprand1;
	}
//	public void setOprand1(double oprand1) {
//		this.oprand1 = oprand1;
//	}
	public double getOprand2() {
		return oprand2;
	}
//	public void setOprand2(double oprand2) {
//		this.oprand2 = oprand2;
//	}
	public double getResult() {
		return result;
	}
//	public void setResult(double result) {
//		this.result = result;
//	}
//	public void setOperator(char operator) {
//		this.operator = operator;
//	}
	
	public MathEquation() {
		System.out.println("No Arg constructor");
	}
	public MathEquation(char operator) {
		this.operator=operator;
	}
	public MathEquation(double oprand1, double oprand2, char operator) {
		
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		this.operator = operator ;
	}
	
	//create another version of calculateX method
	//accept two parameter to set new oprand1 and oprand2
	//calculateX new result
	//return nothing
	public void calculateX(double num1, double num2) {
		//setting new value for oprand1 and oprand2
		this.oprand1=num1;
		this.oprand2=num2;
		
		//do the calculation according to new numbers
		//and whatever operator value we currently have
		//AND WE ALREADY HAVE CALCULATE METHOD TO DO THAT!!!
		Calculate();
		
	}
	
	
	public void Calculate() {
//		if(operator=='+') {
//			this.result=oprand1+oprand2;
//		}else if(operator=='-') {
//			this.result=oprand1-oprand2;
//		}else if(operator=='*') {
//			this.result=oprand1*oprand2;
//		}
		switch(this.operator) {
		case '+':
			this.result= this.oprand1+this.oprand2;
			break;
		case '-':
			this.result=this.oprand1-this.oprand2;
			break;
		case '*':
			this.result=this.oprand1*this.oprand2;
			break;
		case '/':
			this.result=this.oprand1/this.oprand2;
			break;
			default:
				this.result=0;
				
		
		
		}
		
	}
	
	public String toString() {
		return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}
	
	
	
	
}
