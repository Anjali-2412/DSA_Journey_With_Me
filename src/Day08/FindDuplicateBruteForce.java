package Day08;

public class FindDuplicateBruteForce {
	public static void main(String[] args) {
		int[] num = {4,2,7,3,2,4,9,1,3};  
		boolean hasDuplicate = false;
		
		System.out.println("Duplicate Values : ");
		
		for(int i =0;i<num.length;i++) {
			boolean isDuplicate =false;
			
			for(int j=0;j<i;j++) {
				if(num[i] == num[j]) {
					isDuplicate=true;
					break;
				}
			}
			
			if(isDuplicate)
				continue;
			
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.print(num[i]+" ");
					hasDuplicate = true;
					break;
					
				}
				
			}
			
			
		}
		if(!hasDuplicate) {
			System.out.println("None");
		}
		
		
	} // time complexity - o(n²)
	//space - o(1)
}
