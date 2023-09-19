/**
 * Profissional é uma classe que informa o nome completo, a profissão e o documento de identidade profissional, 
 * esta classe será usada no GestorCV.
 */

public class Profissional {
	private String nome;
	private String sobrenome;
	private String profissao;
	private String idProfissional;

// Construtor

	public Profissional(String nome, String sobrenome, String profissao, String idProfissional) {
	   this.nome = (nome != null && !nome.isBlank() ? nome : "Não informado");
	   this.sobrenome = (sobrenome != null && !sobrenome.isBlank() ? sobrenome : "Não informado");
	   this.profissao = (profissao != null && !profissao.isBlank() ? profissao : "Não informado");
	   this.idProfissional = (idProfissional != null && !idProfissional.isBlank() ? idProfissional : "Não informado");
	}

// Fim Construtor

	public String getNome() {
	   return this.nome;
	}

	public String getSobrenome() {
	   return this.sobrenome;
	}

	public String getProfissao() {
	   return this.profissao;
	}

	public String getIdProfissional() {
	   return this.idProfissional;
	}


	public String toString() {
	   return String.format("%s: %s %s%n\t%s: %s%n\t%s: %s%n", "Nome Completo", this.nome, this.sobrenome, "Profissão", this.profissao, "Documento Profissional", idProfissional);
	}

} // Fim da classe Profissional