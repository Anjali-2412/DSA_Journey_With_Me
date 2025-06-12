package Day01_Arrays;

public class MaxAndMinElement {
public static void main(String[] args) {
	int[] a= {12,23,45,65,100};
	int max=a[0];
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
		else if(a[i]<min) {
			min=a[i];
		}
	}
	
	System.out.println("max element : "+max);
	System.out.println("min element : "+min);
}
}
