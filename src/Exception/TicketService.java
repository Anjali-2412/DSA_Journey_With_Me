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
		try {
			manager.updateStatus("PENDING");//Invalid
		}catch(InvalidTicketStatusException e) {
			System.out.println("caught : "+e.getMessage());
		}
		
		try {
			manager.updateStatus("CLOSED");//valid
		}catch(InvalidTicketStatusException e) {
			System.out.println("Caught :"+e.getMessage());
		}
		
		
	}
}
