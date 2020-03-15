package ar.com.educacionit.ws.exception;

public class NoExisteProductoException extends Exception {

	private static final long serialVersionUID = -7191747048628328235L;
	
	private String codigo;

	public NoExisteProductoException(String message, String codigo) {
		super(message);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
