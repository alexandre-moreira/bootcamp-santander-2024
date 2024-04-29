package br.com.junglesoft.app_message.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Ennviando mensagem pelo MSN Messenger");
    }
    
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN Messennger");
    }

}
