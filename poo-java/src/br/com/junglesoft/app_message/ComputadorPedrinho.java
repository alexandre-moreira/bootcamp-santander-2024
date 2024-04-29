package br.com.junglesoft.app_message;

import br.com.junglesoft.app_message.apps.FacebookMessenger;
import br.com.junglesoft.app_message.apps.MSNMessenger;
import br.com.junglesoft.app_message.apps.ServicoMensagemInstantanea;
import br.com.junglesoft.app_message.apps.Telegram;

public class ComputadorPedrinho {

    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "fbm";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }
        
        else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }
        else if(appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
