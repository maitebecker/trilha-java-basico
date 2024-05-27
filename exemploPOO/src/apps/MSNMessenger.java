package apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagm pelo MSN");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagm pelo MSN");
	}
}
