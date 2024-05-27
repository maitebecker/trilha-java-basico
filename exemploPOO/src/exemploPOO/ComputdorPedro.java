package exemploPOO;

import apps.FacebookMesseger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.TelegramMesseger;

public class ComputdorPedro {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		}else if(appEscolhido.equals("fcbk")) {
			smi = new FacebookMesseger();
		}else if(appEscolhido.equals("tlg")){
			smi  = new TelegramMesseger();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
