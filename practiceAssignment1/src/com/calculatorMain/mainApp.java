package com.calculatorMain;
import java.util.Scanner;
import com.calculator.calculator;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Add\n2.Sub\n3.Div\n4.Mul\n5.Exit");
			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();
			int num1 = 0, num2 = 0;
			if(choice <= 4) {
				System.out.println("Enter Two Numbers: ");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
			}
			calculator c = new calculator(num1, num2);
			switch(choice) {
				case 1:{
					System.out.println("The Addition Of Two Numbers is: "+c.add());
					break;
				}
				case 2:{
					System.out.println("The Substraction Of Two Numbers is: "+c.sub());
					break;
				}
				case 3:{
					System.out.println("The Division Of Two Numbers is: "+c.div());
					break;
				}
				case 4:{
					System.out.println("The Multiplication Of Two Numbers is: "+c.mul());
					break;
				}
				case 5:System.exit(0);
				default:System.out.println("Enter Valid Choice");
			}
		}

	}
}
