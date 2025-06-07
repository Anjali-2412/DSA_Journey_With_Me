package Day02_Arrays;

public class MinElement {
public static void main(String[] args) {
	int[] a = {1,24,5,4,3,-6};
	int min =a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("min element: "+min);
}
}
