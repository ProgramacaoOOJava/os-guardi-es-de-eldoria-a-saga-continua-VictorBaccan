public class Guerreiro extends Personagem {
	public Guerreiro(String nome, int nivel, int vida, double poderBase, double forca) {
		super(nome, "Guerreiro", nivel, vida, poderBase);
	}
	
	@Override
	public String usarHabilidadeEspecial() {
		return "\nAtaque Vórtice Esgamagador!";
	}
}
