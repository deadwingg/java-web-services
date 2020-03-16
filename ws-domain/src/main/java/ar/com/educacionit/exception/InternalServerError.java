package ar.com.educacionit.exception;

public class InternalServerError extends Exception {

	private static final long serialVersionUID = -6800810789603607702L;

	public InternalServerError(Exception e) {
		super(e);
	}
}
