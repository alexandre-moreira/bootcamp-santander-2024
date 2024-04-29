package br.com.junglesoft.app_message.apps;

public abstract class ServicoMensagemInstantanea {
    
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet");
    }

}
