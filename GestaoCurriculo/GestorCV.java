/**
 * GestorCV é a classe que irá mostrar os currículos cadastrados.
 */
public class GestorCV {

	public static void main(String[] args) {
	   Profissional jael = new Profissional("Jael", "Kruel", "Advogado", "OAB");
	   System.out.println(jael);

	   Motorista jardel = new Motorista("Jardel", "Leite", "Motorista", "CNH", 20);
	   System.out.println(jardel);

	   Agronomo gabriel = new Agronomo("Gabriel", "Lopes", "Agronomo", "CREA", 3, 0);
	   System.out.println(gabriel);


	} // Fim do método main
} // Fim da classe GestorCV