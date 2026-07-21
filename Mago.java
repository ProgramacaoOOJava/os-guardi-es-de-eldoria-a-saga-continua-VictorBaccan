public class Mago extends Personagem {
	public Mago(String nome, int nivel, int vida, double poderBase, int inteligencia) {
		super(nome, "Mago", nivel, vida, poderBase);
	}
	
	@Override
	public String usarHabilidadeEspecial() {
		return "\nMagia de Meteoros celestiais!";
	}
}
