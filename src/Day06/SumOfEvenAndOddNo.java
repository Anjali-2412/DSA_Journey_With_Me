package Day06;

public class SumOfEvenAndOddNo {
public static void main(String[] args) {
	int[] num = {5,2,7,8,4,3,9};
	
	int evenSum =0;
	int oddSum =0;
	
	//Loop through the arrray
	
	for(int i=0;i<num.length;i++) {
		if(num[i] %2 ==0) {
			evenSum = evenSum+num[i];
		}
		else {
			oddSum=oddSum+num[i];
		}
	}
	//print
	System.out.println("Sum of Even Num : "+evenSum);
	System.out.println("Sum of Odd Num : "+oddSum);
	
}
}
