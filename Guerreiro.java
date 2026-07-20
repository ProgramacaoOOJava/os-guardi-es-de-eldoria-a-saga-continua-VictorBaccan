public class Guerreiro extends Personagem {
	double forca;
	
	public Guerreiro(String nome, int nivel, int vida, double poderBase, double forca) {
		super(nome, "Guerreiro", nivel, vida, poderBase);
		this.forca = forca;
	}
	
	@Override
	public void usarHabilidadeEspecial() {
		System.out.println("Guerreiro usou ataque esgamagador!\n");
	}
	
	@Override
	public String exibirStatus() {
		return super.exibirStatus() + "\n" + "Força: " + Guerreiro.this.forca;
	}
}
