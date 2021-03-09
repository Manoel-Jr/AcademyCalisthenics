package br.com.Academy.Calisthenics.exception;

public class AplicationException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public AplicationException(String msg) {
		super(msg);
	}

}
