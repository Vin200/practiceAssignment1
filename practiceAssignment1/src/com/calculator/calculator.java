package com.calculator;

public class calculator {
	
	int num1, num2;
	
	
	public calculator(int num1, int num2) {
		super();
		this.num1 = num1; //usage of this keyword
		this.num2 = num2; //usage of this keyword
	}

	public int add() {
		return (num1+num2);//addition operator
	}
	
	public int sub() {
		return (num1-num2);//substraction operator
	}
	
	public int mul() {
		return (num1*num2);//multiplication operator
	}
	
	public float div() {
		float result = 0.0f;
		try {
			result = (float)num1/(float)num2;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	    return result;
	}
}
