public abstract class Personagem implements Comparable<Personagem>{
	String nome;
	String classe;
	int nivel;
	int vida;
	double poderBase;
	
//	CRIAÇÃO DO CONSTRUTOR DA CLASSE PERSONAGEM
	public Personagem(String nome, String classe, int nivel, int vida, double poderBase) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel; 
		this.vida = vida;
		this.poderBase = poderBase;
	}
	
	public int compareTo(Personagem outro) {
		if (this.nivel < outro.nivel) {
			return -1;
		} else if (this.nivel > outro.nivel) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Personagem: " + nome; 
	}
	
	public String exibirStatus() {
		return "Nome: " + nome + "\nClasse: " + classe + "\nNivel: " + nivel + 
				"\nVida: " + vida + "\nPoder Base: " + poderBase;
	}
	
	public abstract void usarHabilidadeEspecial();
}
