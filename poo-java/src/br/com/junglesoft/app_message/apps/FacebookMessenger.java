package br.com.junglesoft.app_message.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando messagem pelo Facebook");
    }

    public void receberMensagem(){
        System.out.println("Recebendo menssagem pelo Facebook");
    }
}
