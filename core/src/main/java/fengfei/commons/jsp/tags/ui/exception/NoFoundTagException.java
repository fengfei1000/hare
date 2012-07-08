package fengfei.commons.jsp.tags.ui.exception;

public class NoFoundTagException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static String message = "Can't found parent tag.";

	public NoFoundTagException() {
		super(message);
	}

	public NoFoundTagException(String message) {
		super(message);
	}
}
