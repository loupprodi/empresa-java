package empresa;

public class mainEmpresa {

	public static void main(String[] args) {
	
		proprietario proprietario = new proprietario ("Lucas","Galvão","1234567891011",35,"","Lapis para a vida","Avenida Joãozinho n: 49");
		System.out.println(proprietario);
		
		produto produto = new produto ("Joãozinho","conjunto de lapiseiras","Galvão lapiseiras", 289.00);
		System.out.println(produto);
		
		
		cliente cliente = new cliente ("Joãozinho","da Silva", "12315154556", 2700.00);
		System.out.println(cliente);
		
		venda venda = new venda ("conjunto de lapiseiras", 0.9, 289.00);
		System.out.println(venda);

	}

}
