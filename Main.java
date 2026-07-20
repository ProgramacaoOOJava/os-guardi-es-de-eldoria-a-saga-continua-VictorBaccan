public class Main {

	public static void main(String[] args) {
//		CRIANDO NOVOS PERSONAGENS, EXIBINDO STATUS E UTILIZANDO HABILIDADE ESPECIAL
		Mago Gandalf = new Mago("Gandalf", 99, 100, 99, 951);
		System.out.println(Gandalf.exibirStatus());
		Gandalf.usarHabilidadeEspecial();
		
		Guerreiro Guts = new Guerreiro("Guts", 99, 786, 484, 361);
		System.out.println(Guts.exibirStatus());
		Guts.usarHabilidadeEspecial();
		
//		CRIANDO NOVOS MEMBROS
		Mago Melina = new Mago("Melina", 52, 307, 186, 520);
		Guerreiro Radahn = new Guerreiro("Radahn", 57, 62, 220, 480);
		
//		ADICIONANDO MEMBROS NO GRUPO
		Grupo grupoA = new Grupo("Avengers");
		grupoA.adicionarMembro(Radahn);
		grupoA.adicionarMembro(Gandalf);
		
		Grupo grupoB = new Grupo("Destroyers");
		grupoB.adicionarMembro(Guts);
		grupoB.adicionarMembro(Melina);
		
//		LISTANDO OS GRUPOS
		grupoA.listarMembros();
		grupoB.listarMembros();
		
//		EXIBINDO BATALHA DE PERSONAGENS
		grupoA.batalhar(Gandalf, Guts);
		grupoB.batalhar(Radahn, Melina);
		
//		CRIANDO E CHAMANDO FUNÇÃO DE BATALHA NA ARENA (GRUPO)
		Arena arena = new Arena(grupoA, grupoB);
		arena.batalhaGrupo();
	}
}
