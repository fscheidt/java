package br.edu.ifpr.web4.revisao.model;

public class Usuario implements Comparable<Usuario> {
	
	private static Integer nextId = 1;
	private Integer id;
	private String nome;
	private Integer pontos;
	private boolean moderador;

	public Usuario(String nome, Integer pontos) {
		this.id = nextId++;
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	@Override
	public String toString() {
		return "Usuario:"+id+" | " + nome + " | " + pontos;
	}
	
	@Override
	public int compareTo(Usuario outro) {
//		return this.id.compareTo(outro.id); // -1, 0 ou 1
		return this.nome.compareTo(outro.nome);
		
	}
	
	public static void main(String[] args) {
//		compara por id, nome,
		Usuario u1 = new Usuario("Roberto", 350);
		Usuario u2 = new Usuario("Roberta", 300);
		if(u1 == u2) {// endereço sempre sera diferente
			
		}
		u1.compareTo(u2);
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}

	public Integer getId() {
		return id;
	}

	
}
