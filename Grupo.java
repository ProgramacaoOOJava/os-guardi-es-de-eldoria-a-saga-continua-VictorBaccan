import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grupo {
	private String nomeGrupo;
	private List<Personagem> membros;
	
	public Grupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
		this.membros = new ArrayList<>();
	}
	
	public String getNomeGrupo() {
		return nomeGrupo;
	}
	
	public void adicionarMembro(Personagem personagem) {
		membros.add(personagem);
	}
	
	public void listarMembros() {
		System.out.println("\n--- Membros do Grupo " + nomeGrupo + " --- ");
		
		for (Personagem personagems : membros) {
			System.out.println(personagems.exibirStatus());
			personagems.usarHabilidadeEspecial();
		}
		
		System.out.println(" ---------------------------------- ");
	}
	
	public void batalhar(Personagem p1, Personagem p2) {
		System.out.println("\n --- Inicio da Batalha ---\n");
		
		double poderTotalp1 = p1.nivel * p1.poderBase;
		double poderTotalp2 = p2.nivel * p2.poderBase;
		
		System.out.println(p1.nome + " Poder Total: " + String.format("%.2f", poderTotalp1));
		System.out.println(p2.nome + " Poder Total: " + String.format("%.2f\n", poderTotalp2));
		
		if (poderTotalp1 > poderTotalp2) {
			System.out.println(p1.nome + " venceu a batalha!" + " Poder Total: " + poderTotalp1);
		} else if (poderTotalp1 < poderTotalp2) {
			System.out.println(p2.nome + " venceu a batalha!" + " Poder Total: " + poderTotalp2);
		} else {
			System.out.println(" a batalha empatou!");
		}
	
		System.out.println("\n --- Fim da Batalha ---");
	}
	
	public double getPoderTotal() {
		double totalPoder = 0;
		
		for (Personagem personagems : membros) {
			totalPoder += personagems.nivel * personagems.poderBase;
		}
		
		return totalPoder;
	}
	
	public void ordenar() {
		Collections.sort(membros);
	}
}
