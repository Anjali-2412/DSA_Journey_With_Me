package Day06;

public class SumOfDigitsEachElementInArray {
public static void main(String[] args) {
	int[] num = {123,45,9,100,78};
	System.out.println("sum of each digit");
	
	for(int i=0;i<num.length;i++) {
		int n= num[i];
		int sum =0;
		
		while(n>0) {
			sum =sum+n%10;
			n=n/10;
		}
		System.out.println("Number : "+num[i]+" -> sum of digits : "+sum);
	}
}
}
