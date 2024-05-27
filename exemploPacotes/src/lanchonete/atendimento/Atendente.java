package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		System.out.println("SERVINDO MESA");
		pegarLancheCozinha();
	}
	
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO LANCHE NA COZINHA");
	}
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GAS");
	}
}
