package usuarios;
// CLASSE DE USUARIO ADMINISTRADOR DO SISTEMA, SOMENTE RETORNA O NOME E SENHA   
public class Admin {
	
	private String adminLogin = "admin";
	private String adminSenha = "0000";
	private String cargo;
	private String email;
	
	
	public String getAdminLogin() {
		return adminLogin;
	}
	public String getAdminSenha() {
		return adminSenha;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
