package Preparation_Interview_Assesment;

public class StepsToZero {
	
	public static int stepsToZero(int n) {
		int steps=0;
		
		while(n>0) {
			if(n%5 == 0) {
				n/=5;
			}
			else if(n%3 == 0) {
				n/=3;
			}
			else if(n%2 == 0) {
				n=n/2;
			}
			else {
				n--;
			}
			steps++;
		}
		
		
		
		
		return steps;
	}
	public static void main(String[] args) {
		int n=13;
		System.out.println("steps to zero for "+n+ " = "+stepsToZero(n)+ " steps");

	}

}
