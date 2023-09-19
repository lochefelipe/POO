/**
 * Agronomo é uma classe que informa dados adicionais para Eng. Agronomos 
 * esta classe será usada no GestorCV.
 */

public class Agronomo extends Profissional {
	private int qtdeGado;
	private int hectaresDeTerra;

	public Agronomo(String nome, String sobrenome, String profissao, String id_profissional, int qtdeGado, int hectaresDeTerra) {

	   super(nome, sobrenome, profissao, id_profissional);

	   this.qtdeGado = (qtdeGado > 0 ? qtdeGado : 0);
	   this.hectaresDeTerra = (hectaresDeTerra > 0 ? hectaresDeTerra : 0);
	}

	public int qtdeGado() {
	   return qtdeGado;
	}

	public int hectaresDeTerra() {
	   return hectaresDeTerra;
	}

	@Override
	public String toString() {
	   return String.format("%s: %s %s%n\t%s: %s%n\t%s: %s%n\t%s: %d%n\t%s: %d%n", "Nome Completo", getNome(), getSobrenome(), "Profissão", getProfissao(), "Documento Profissional", getIdProfissional(), "Quantidade de Gado", qtdeGado, "Posse de Hectares de Terra", hectaresDeTerra);
	}

} // Fim da class Motorista
