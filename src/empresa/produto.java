package empresa;

public class produto {
	private String nome_comprador;
	private String nome_produto;
	private String marca_produto;
	private double preco_produto;
	
		public produto(String nome_comprador, String nome_produto, String marca_produto, double preco_produto) {
			setNome_comprador(nome_comprador);
			setNome_produto(nome_produto);
			setMarca_produto(marca_produto);
			setPreco_produto(preco_produto);
	}
	public String getNome_comprador() {
		return nome_comprador;
	}

	public void setNome_comprador(String nome_comprador) {
		this.nome_comprador = nome_comprador;
		}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public String getMarca_produto() {
		return marca_produto;
	}
	public void setMarca_produto(String marca_produto) {
		this.marca_produto = marca_produto;
	}
	public double getPreco_produto() {
		return preco_produto;
	}
	public void setPreco_produto(double preco_produto) {
		this.preco_produto = preco_produto;
	}
	
	public String toString() {
		return String.format("O %s, que é um cliente frequente comprou o uma %s, da marca %s, com o valor de R$ %.2f reais cada conjunto.",getNome_comprador(),getNome_produto(),getMarca_produto(),getPreco_produto());
	}

	
	

}
