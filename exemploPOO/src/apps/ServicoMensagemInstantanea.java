package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//somente filhos conhecem esse método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado");
	}
}
