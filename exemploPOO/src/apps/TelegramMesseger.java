package apps;

public class TelegramMesseger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagm pelo Telegram");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagm pelo Telegram");
	}
	
}
