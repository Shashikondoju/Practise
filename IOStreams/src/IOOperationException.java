
public class IOOperationException extends Exception {
	
	
	public IOOperationException() {
		
	}
	public IOOperationException(String errMsg) {
		super(errMsg);
	}
	public IOOperationException(Exception e) {
		super(e);
	}
}
