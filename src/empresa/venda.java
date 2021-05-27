package empresa;

public class venda implements salario {
	
	private String produto_vendido;
	private double porcentagem_venda;
	private double valor_produto;
	
	public venda(String produto_vendido, double porcentagem_venda, double valor_produto) {
		setProduto_vendido(produto_vendido);
		setPorcentagem_venda(porcentagem_venda);
		setValor_produto(valor_produto);
	}
	
	
	public String getProduto_vendido() {
		return produto_vendido;
	}
	public void setProduto_vendido(String produto_vendido) {
		this.produto_vendido = produto_vendido;
	}
	public double getPorcentagem_venda() {
		return porcentagem_venda;
	}
	public void setPorcentagem_venda(double porcentagem_venda) {
		this.porcentagem_venda = porcentagem_venda;
	}
	public double getValor_produto() {
		return valor_produto;
	}

	public void setValor_produto(double valor_produto) {
		this.valor_produto = valor_produto;
	}
	
	public double getSalario() {
		return(valor_produto * 0.15);
	}
	
	
	public String toString() {
		return String.format("O %s, de preço R$ %.2f reais e rendeu uma porcentagem de venda de R$ %.2f reais para o proprietario. ",getProduto_vendido(),getValor_produto(),getSalario());
		
	}


	


	

}
