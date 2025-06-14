package StarPatternQues;

public class Pyramid_Pattern {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n ;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");// 2 spaces per missing row
			}
			for(int k=1;k <= (2*i-1);k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}
