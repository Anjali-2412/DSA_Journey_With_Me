package Exception;
class TicketManager{
	
	public void updateStatus(String status) {
		if(!status.equalsIgnoreCase("OPEN")&&
			!status.equalsIgnoreCase("IN_PROGRESS")&&
			!status.equalsIgnoreCase("CLOSED"))
		{
			throw new InvalidTicketStatusException("Invalid Ticket status :"+status);
			
		}
		System.out.println("Ticket status updated to : "+status);
					
	}

}
public class TicketService {
	public static void main(String[] args) {
		TicketManager manager = new TicketManager();
		    manager.updateStatus("CLOSED");//valid
			manager.updateStatus("PENDING");//Invalid
		
		
		
			
		
		
		
	}
}
