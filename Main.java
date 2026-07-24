public class Main {

	public static void main(String[] args) {
//		CRIANDO NOVOS PERSONAGENS
		Mago Gandalf = new Mago("Gandalf", 99, 100, 99.00, 951);
		Guerreiro Guts = new Guerreiro("Guts", 99, 786, 484.00, 361.00);
		Mago Melina = new Mago("Melina", 52, 307, 186.00, 520);
		Guerreiro Radahn = new Guerreiro("Radahn", 57, 62, 220.00, 480.00);
		
//		ADICIONANDO MEMBROS NO GRUPO
		Grupo grupoA = new Grupo("Cyber-Psychos");
		grupoA.adicionarMembro(Radahn);
		grupoA.adicionarMembro(Melina);
		
		Grupo grupoB = new Grupo("Destroyers");
		grupoB.adicionarMembro(Guts);
		grupoB.adicionarMembro(Gandalf);
		
//		LISTANDO OS GRUPOS
		grupoA.listarMembros();
		grupoB.listarMembros();
		
//		EXIBINDO BATALHA DE PERSONAGENS
		grupoA.batalhar(Gandalf, Guts);
		grupoB.batalhar(Radahn, Melina);
		
//		CRIANDO E CHAMANDO FUNÇÃO DE BATALHA NA ARENA (GRUPO)
		Arena arena = new Arena(grupoA, grupoB);
		arena.batalhaGrupo();
		
//		TESTES DE COMPARAÇÃO (EQUAL)
		System.out.println("\n=== COMPARAÇÕES (EQUAL) ===");
		
		Guerreiro char1 = new Guerreiro("Valkyrie", 98, 848, 675.00, 785.00);
		Guerreiro char2 = new Guerreiro("Dark Knight", 69, 757, 814.00, 953.00);
		
		System.out.println("\n" + char1 + char1.usarHabilidadeEspecial() + "\n" + char1.instanciaPersonagem(char1));
		System.out.println("\n" + char2 + char2.usarHabilidadeEspecial() + "\n" + char2.instanciaPersonagem(char2));
		
		System.out.println("--- RESULTADO DA COMPARACAO ---\n");
		if (char1.equals(char2) == true) {
			System.out.println("O personagem [" + char1.getNome() + "] é igual ao Personagem [" + char2.getNome() + "]");
			System.out.println(char1.getNome() + " HashCode: " + char1.hashCode());
			System.out.println(char2.getNome() + " HashCode: " + char2.hashCode());
		} else {
			System.out.println("O personagem [" + char1.getNome() + "] é diferente do Personagem [" + char2.getNome() + "]");
			System.out.println(char1.getNome() + " HashCode: " + char1.hashCode());
			System.out.println(char2.getNome() + " HashCode: " + char2.hashCode());
		}
		
//		LISTANDO GRUPOS NOVAMENTE (NOVOS VALORES)
		grupoA.listarMembros();
		grupoB.listarMembros();
	}
}
