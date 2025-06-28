package Day17;

public class fibonaccieSeries {
	public static void main(String[] args) {
		int n=10,first =0,second =1;
		for(int i=0;i<=n;++i) {
			System.out.println(first+ " ");
			int next = first+second;
			first = second;
			second =next;
		}
	}
}
