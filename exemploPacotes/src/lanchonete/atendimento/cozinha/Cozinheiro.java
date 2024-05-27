package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NO BALCAO");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO VITAMINA");
	}
	
	//metódo só é visto nessa classe
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	//O atendente não está no mesmo pacote, então ele não pode executar esse método
	private void pedirParaTrocaGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirParaTrocaGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife meuAmigo) {
		meuAmigo.entregarIngredientes();
	}
}
