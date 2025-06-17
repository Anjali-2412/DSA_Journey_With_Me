package Day09;

public class firstRepeatedCharUsingArray {
  public static void usingArray(String word) {
	   word = word.toLowerCase();
	   int[] cnt = new int[256]; 
	   for(char ch : word.toCharArray()) {
		   cnt[ch]++;
		   
	   }
	   for(char ch : word.toCharArray()) {
		   
		   if(cnt[ch]>1) {
			   System.out.println("First repeating char :"+ch);
			   break;
		   }
	   }
  }
  public static void main(String[] args) {
	String str = "programming";
	usingArray(str);
}
}
