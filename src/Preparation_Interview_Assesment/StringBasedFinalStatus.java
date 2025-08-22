package Preparation_Interview_Assesment;

import java.util.Scanner;

public class StringBasedFinalStatus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String statuses = sc.nextLine();
		String [] parts = statuses.split(";");
		
		String finalStatus = parts[parts.length-1];
		
		System.out.println(finalStatus);
				
	}
}
