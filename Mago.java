import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem implements Auditavel {
	List<String> acoes;
	
	public Mago(String nome, int nivel, int vida, double poderBase, int inteligencia) {
		super(nome, "Mago", nivel, vida, poderBase);
		this.acoes = new ArrayList<>();
	}
	
	public void registrarAcao(String acao) {
		acoes.add(acao);
	}
	
	public void auditarAcoes() {
		int i = 1;
		System.out.println("\n=== Registro de Ações (Mago) ===");
		for (String acao : acoes) {
			System.out.println("  - Ação " + i + ": " + acao);
			i++;
		}
	}
	
	@Override
	public String usarHabilidadeEspecial() {
		return " Usou Magia de Meteoros celestiais!";
	}
}
