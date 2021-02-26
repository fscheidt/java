package br.edu.ifpr.web4.revisao.lambda;

import java.util.List;

import br.edu.ifpr.web4.revisao.data.DataSource;
import br.edu.ifpr.web4.revisao.model.Movie;
import br.edu.ifpr.web4.revisao.model.Usuario;

public class TesteLambdaExpression {
	
	public static void main(String[] args) {
		
		/**
		 * Obtem a lista de usuarios:
		 */
		List<Usuario> userList = DataSource.getUsuarios();
		
		// Itera em cada usuario e imprime:
		for(Usuario user: userList) {
			System.out.println(user);
		}
		System.out.println("[1]=====================");
		
		/**
		 * 
		Essa expressão lambda:
		
			(Usuario u) -> System.out.println(u) ==> metodo
			
		É semelhante a um método java:

		public Usuario nomeMetodo (Usuario u) {
			System.out.println(u);
		}
		 * 
		 */
		
		// podemos então escrever uma espressão lambda (bem verbosa):		
		userList.forEach(
		(Usuario u) -> 
			{
				System.out.println(u);
			}
		);
		
		System.out.println("[2]=====================");
		
		// que pode ser simplificada para:
		userList.forEach((u) -> System.out.println(u));
		
		
		// ainda mais simplificado se no caso do println:
		System.out.println("[3]=====================");
		userList.forEach(System.out::println);
		
		/**
		 * 
		 * Filtrando filmes usando stream e filter:
		 * 
		 */
		System.out.println("[4]=====================");
				
		// Obtem a lista de filmes:
		List<Movie> movies = DataSource.getMovies();
		for(Movie m: movies) {
			if(m.getScore() >= 8) { // exibe somente filmes com nota maior que 8
				System.out.println(m.getTitle());
			}
		}
		
		System.out.println("[5]=====================");
		// equivalente em função usando filter:
		movies.stream()
			.filter(movie -> movie.getScore() >= 8)
			.forEach(System.out::println);
		
		
		System.out.println("[6]=====================");
		// Remove todo filme cuja nota seja menor igual a 6
		movies.removeIf(m -> m.getScore() <= 6);
		movies.forEach(System.out::println);
		
	}

}
