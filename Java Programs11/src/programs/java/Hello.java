package programs.java;


import java.util.*;
public class Hello {
	
     
	public static int sum (int a,int b)
		{
	
		    int sum;
			sum=a+b;
			return sum;
			
			}

	public static void main(String[] args) {
			int result;
			int a1,b1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		a1=sc.nextInt();
		System.out.println("Enter second number");
		b1=sc.nextInt();
	    result = sum(a1,b1);
		System.out.println("Sum:"+result);
		}
		}
		

	

