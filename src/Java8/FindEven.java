package Java8;

import java.util.Arrays;
import java.util.List;

public class FindEven {
 public static void main(String[] args) {
	
	 
	 List<Integer> num = Arrays.asList(10,15,20,24,23,26);
	 num.stream().filter(n->n%2==0).forEach(System.out::println);
}
}
