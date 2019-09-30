package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Postagem;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Comentario c1 = new Comentario ("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Uau, que impressionante!");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Postagem p1 = new Postagem (
				sdf.parse("21/06/2018 13:05:44"),
						"Viajando para Nova Zelândia", 
						"Eu vou visitar esse pais maravilhoso!", 
						12);
		p1.adComentario(c1);
		p1.adComentario(c2);
		
		Comentario c3 = new Comentario ("Boa noite");
		Comentario c4 = new Comentario("Que a força esteja com você");
		
		Postagem p2 = new Postagem (
				sdf.parse("28/07/2018 23:14:19"),
						"Boa Noite Pessoal", 
						"Vejo você amanhã", 
						5);
		p1.adComentario(c3);
		p1.adComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
