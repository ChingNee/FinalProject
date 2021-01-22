package exception;

public class ItemNotAvailableForUpdateException extends Exception {

	private String message = "Item is not available for update";

	public ItemNotAvailableForUpdateException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
