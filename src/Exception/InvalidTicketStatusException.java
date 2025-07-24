package Exception;

public class InvalidTicketStatusException extends RuntimeException {
	public InvalidTicketStatusException() {
		super("Invalid operation on ticket due to its current status.");
	}
	public InvalidTicketStatusException(String message) {
		super(message);
	}
	public InvalidTicketStatusException(String message, Throwable cause) {
		super(message,cause);
	}
	public InvalidTicketStatusException(Throwable cause) {
		super(cause);
	}
}
