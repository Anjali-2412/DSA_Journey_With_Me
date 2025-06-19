package Java8;

import java.util.Arrays;
import java.util.List;

public class FindSumofListOfElementUsingStream {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(10,20,30,40,50);
	int sum = list.stream() //converts the lists into a stream
			.mapToInt(x->x.intValue()) //This list of Stream is type Integer(wrapper class) but .sum() works on primitive int. andInteger::intValue is method reference same as : x->x.intValue().
			.sum();
	
	int sum1 = list.stream() //converts the lists into a stream
			.mapToInt(Integer::intValue) //This list of Stream is type Integer(wrapper class) but .sum() works on primitive int. andInteger::intValue is method reference same as : x->x.intValue().
			.sum();
	System.out.println("sum : "+sum);
			
}
}
