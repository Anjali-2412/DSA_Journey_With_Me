package Day13;

public class BubbleSort {
		public static void main(String[] args) {
			int[] arr = {64,34,25,12,22,11,90};
			int n=arr.length;
			
			for(int i=0;i<n-1;i++) {
				boolean swapped = false;
				
				for(int j=0;j<n-i-1;j++) {
					
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
						swapped =true;
					}
				}
				
				if(!swapped) {
					break;
				}
			}
			
			for(int num:arr) {
				System.out.print(num+" ");
			}
		}
}
//time complexity - o(n)
//space  - o(1)