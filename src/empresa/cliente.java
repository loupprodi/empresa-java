package empresa;

public class cliente {
	
	private String nome_cliente;
	private String sobrenome_cliente;
	private String cpf_cliente;
	private double renda_cliente;
	
	
	
	public cliente(String nome_cliente, String sobrenome_cliente, String cpf_cliente, double renda_cliente) {
		setNome_cliente(nome_cliente);
		setSobrenome_cliente(sobrenome_cliente);
		setCpf_cliente(cpf_cliente);
		setRenda_cliente(renda_cliente);
	}
	
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getSobrenome_cliente() {
		return sobrenome_cliente;
	}
	public void setSobrenome_cliente(String sobrenome_cliente) {
		this.sobrenome_cliente = sobrenome_cliente;
	}
	public String getCpf_cliente() {
		return cpf_cliente;
	}
	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	public double getRenda_cliente() {
		return renda_cliente;
	}
	public void setRenda_cliente(double renda_cliente) {
		this.renda_cliente = renda_cliente;
	}
	
	public String toString() {
		return String.format("%s %s, portador do cpf: %s, possui uma renda de %.2f reais.",getNome_cliente(),getSobrenome_cliente(),getCpf_cliente(),getRenda_cliente());
	}
	

}
