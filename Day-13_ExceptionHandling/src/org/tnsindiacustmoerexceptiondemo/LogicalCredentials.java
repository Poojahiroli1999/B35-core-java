package org.tnsindiacustmoerexceptiondemo;

@SuppressWarnings("serial")
public class LogicalCredentials extends Exception {
	private String id;
	private String password;

	

	public LogicalCredentials(String id2, String password2) {
		// TODO Auto-generated constructor stub
	}



	public void LoginCredentials(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}



	@Override
	public String toString() {
		return "LoginCredentials [id=" + id + ", password=" + password + "]";
	}


}
