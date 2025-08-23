package Preparation_Interview_Assesment;

public class NetFeedbackScore {
		public static int netFeedbackScore(String f) {
			String[] feedback = f.split(";");
			int netScore =0;
			
			for(String s : feedback) {
				s = s.trim().toLowerCase();
				if(s.equals("positive")) {
					netScore=netScore+1;
				}
				else if(s.equals("negative")) {
					netScore=netScore-1;
				}
				else if(s.equals("neutral")) {
					
				}
				else {
					System.out.println("invalid");
				}
				
			}
			return netScore;
			
		}
		public static void main(String[] args) {
			 String feedback1 = "positive;neutral;negative;positive;negative";
		        System.out.println("Net Feedback Score: " + netFeedbackScore(feedback1));
		        
		        String feedback2 = "neutral";
		        System.out.println("Net Feedback Score: " + netFeedbackScore(feedback2));
		}
		
}
