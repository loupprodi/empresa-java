package empresa;

public class mainEmpresa {

	public static void main(String[] args) {
	
		proprietario proprietario = new proprietario ("Lucas","Galv�o","1234567891011",35,"","Lapis para a vida","Avenida Jo�ozinho n: 49");
		System.out.println(proprietario);
		
		produto produto = new produto ("Jo�ozinho","conjunto de lapiseiras","Galv�o lapiseiras", 289.00);
		System.out.println(produto);
		
		
		cliente cliente = new cliente ("Jo�ozinho","da Silva", "12315154556", 2700.00);
		System.out.println(cliente);
		
		venda venda = new venda ("conjunto de lapiseiras", 0.9, 289.00);
		System.out.println(venda);

	}

}
