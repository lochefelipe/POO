/**
 * Motorista é uma classe que informa dados adicionais para Motoristas 
 * esta classe será usada no GestorCV.
 */

public class Motorista extends Profissional {
	private int anosCompletos;

	public Motorista(String nome, String sobrenome, String profissao, String id_profissional, int anosCompletos) {

	   super(nome, sobrenome, profissao, id_profissional);

	   this.anosCompletos = (anosCompletos >= 18 ? anosCompletos : 0);
	}

	public int anosCompletos() {
	   return anosCompletos;
	}

	@Override
	public String toString() {
	   return String.format("%s: %s %s%n\t%s: %d %n\t%s: %s%n\t%s: %s%n", "Nome Completo", getNome(), getSobrenome(), "Idade", anosCompletos, "Profissão", getProfissao(), "Documento Profissional", getIdProfissional());
	}

} // Fim da class Motorista
