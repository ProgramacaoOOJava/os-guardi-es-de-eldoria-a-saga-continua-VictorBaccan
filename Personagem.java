import java.util.Objects;

public abstract class Personagem implements Comparable<Personagem>{
	private String nome;
	private String classe;
	private int nivel;
	private int vida;
	private double poderBase;
	
//	CRIAÇÃO DO CONSTRUTOR DA CLASSE PERSONAGEM
	public Personagem(String nome, String classe, int nivel, int vida, double poderBase) {
		this.nome = nome;
		this.classe = classe;
		this.nivel = nivel; 
		this.vida = vida;
		this.poderBase = poderBase;
	}
	
	protected void atribuirBencao(double valor) {
		if (valor > 0) {
			poderBase += valor;
			System.out.println("\nBônus de " + valor +
					" atribuido a " + nome + ". Novo Poder Base: " + poderBase + "\n");
		} else {
			System.out.println("\nErro: Valor do bônus deve ser positivo!" + "\n");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public int getVida() {
		return vida;
	}
	
	public double getPoderBase() {
		return poderBase;
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
	
//	DEFINE O QUE EXIBIR COM INSTANCEOF PARA CADA CLASSE DE PERSONAGEM
	public String instanciaPersonagem(Personagem p) {
		String stringTexto = "";
		
		if (p instanceof Mago) {
			stringTexto = "O personagem " + p.getNome() + " é um Mago de nivel " + 
		p.getNivel();
		} else if (p instanceof Guerreiro) {
			stringTexto = "O personagem " + p.getNome() + " é um Guerreiro de nivel " +
		p.getNivel() + "\n";
		}
		return stringTexto;
	}
	
	@Override
	public String toString() {
		return "Personagem: " + nome + "\nClasse: " + classe + "\nNivel: " + nivel + 
				"\nVida: " + vida + "\nPoder Base: " + poderBase;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Personagem func = (Personagem) obj;
		return Objects.equals(nome, func.nome) &&
			   Objects.equals(classe, func.classe);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, classe);
	}
	
	public abstract String usarHabilidadeEspecial();
}
