package empresa;

public abstract class funcionario {
	 
	  private String nome;
	  private String sobrenome;
	  private String cpf;
	  private int idade;
	  
	  public funcionario (String nome,String sobrenome, String cpf,int idade){
		  setNome(nome);
		  setSobrenome(sobrenome);
		  setCpf(cpf);
		  setIdade(idade);
	  	}

	public String getNome() {
		return nome;
		}

	public void setNome(String nome) {
		this.nome = nome;
		}

	public String getSobrenome() {
		return sobrenome;
		}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		}

	public String getCpf() {
		return cpf;
		}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		}
	
	public int getIdade() {
		return idade;
		}

	public void setIdade(int idade) {
		this.idade = idade;
		}
	
	  
}



	