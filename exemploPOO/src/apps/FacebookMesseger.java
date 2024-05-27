package apps;

//herança: característica e comportamentos comuns são compartilhados atrvés de uma hierarquia
public class FacebookMesseger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagm pelo Facebook");
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagm pelo Facebook");
	}
}