public class Arena {
	private Grupo playersA;
	private Grupo playersB;

	public Arena(Grupo grupo1, Grupo grupo2) {
		this.playersA = grupo1;
		this.playersB = grupo2;
	}
	
	public void batalhaGrupo() {
		double totalP1 = playersA.getPoderTotal();
		double totalP2 = playersB.getPoderTotal();
		
		playersA.ordenar();
		playersB.ordenar();
		
		if (totalP1 > totalP2) {
			System.out.println("Grupo 1 venceu! " + "Poder Total: " + totalP1);
		} else if (totalP1 < totalP2) {
			System.out.println("Grupo 2 venceu! " + "Poder Total: " + totalP2);
		} else {
			System.out.println("Grupos empataram!");
		}
	}
}
