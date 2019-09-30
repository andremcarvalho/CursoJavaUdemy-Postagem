package entidades;

public class Comentario {

	//atributos
	private String texto;
	
	//construtores
	public Comentario () {
		
	}

	public Comentario(String texto) {
		this.texto = texto;
	}
	
	//get e set (get para pegar o valor e set par alterar o valor do atributo

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
