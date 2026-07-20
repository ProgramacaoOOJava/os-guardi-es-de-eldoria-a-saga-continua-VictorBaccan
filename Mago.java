public class Mago extends Personagem {
	int inteligencia;
	
	public Mago(String nome, int nivel, int vida, double poderBase, int inteligencia) {
		super(nome, "Mago", nivel, vida, poderBase);
		this.inteligencia = inteligencia;
	}
	
	@Override
	public void usarHabilidadeEspecial() {
		System.out.println("Mago usou meteoros celestiais!\n");
	}
	
	@Override
	public String exibirStatus() {
		return super.exibirStatus() + "\n" + "Inteligencia: " + Mago.this.inteligencia;
	}
}
