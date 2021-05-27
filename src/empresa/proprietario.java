package empresa;

public class proprietario extends funcionario {
	
	private String id_proprietario;
	private String nome_empresa;
	private String localizacao;
	private venda venda;

	public proprietario(String nome, String sobrenome, String cpf, int idade, String id_proprietario,String nome_empresa, String localizacao) {
		super(nome, sobrenome, cpf, idade);
		setId_proprietario(id_proprietario);
		setNome_empresa(nome_empresa);
		setLocalizacao(localizacao);
		setVenda(venda);
		
	}

	public String getId_proprietario() {
		return id_proprietario;
		}
	public void setId_proprietario(String id_proprietario) {
		this.id_proprietario = id_proprietario;
		}
	public String getNome_empresa() {
		return nome_empresa;
		}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
		}
	public String getLocalizacao() {
		return localizacao;
		}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
		}
	public venda getVenda() {
		return venda;
	}

	public void setVenda(venda venda) {
		this.venda = venda;
	}

	
	public String toString() {
		return String.format("%s %s,  tem %d anos, portador do cpf: %s, é o proprietario da empresa %s que é localizado na %s. ", getNome(),getSobrenome(),getIdade(),getCpf(),getNome_empresa(),getLocalizacao());
								
	}

	
}
