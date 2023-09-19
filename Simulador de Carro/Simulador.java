public class Simulador {
    
    public static void main(String[] args) {
        Carro carro1;
        Carro carro2;

        carro1 = new Carro("Branco", "Ford KA", 2015);
        carro2 = new Carro("Preto", "Onix", 2020);

        // System.out.printf("Carro1: %s\n", carro1);
        // System.out.printf("Carro2: %s\n", carro2);

	Motorista motorista = new Motorista();
	String nome = motorista.nomeMotorista();
	String cnh = motorista.numeroCnh();
	int idade = motorista.idadeMotorista();

        Tela tela = new Tela();
        double aceleracao = tela.pedirAceleracao();
        int tempo = tela.pedirTempo();

        carro1.acelerar(aceleracao, tempo);

	nome = motorista.nomeMotorista();
	cnh = motorista.numeroCnh();
	idade = motorista.idadeMotorista();
        aceleracao = tela.pedirAceleracao();
        tempo = tela.pedirTempo();
        carro2.acelerar(aceleracao, tempo);

        System.out.printf("O motorista %s de %d anos dono da CNH nº%s, estava com o seguinte veículo: \n%s\n", nome, idade, cnh, carro1);
        System.out.printf("O motorista %s de %d anos dono da CNH nº%s, estava com o seguinte veículo: \n%s\n", nome, idade, cnh, carro2);
    } // fim do método main(String[])

} // fim da classe Simulador