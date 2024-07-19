package cliente;

import iphone.Iphone;

public class Cliente {
 public static void main(String[] args) {

    Iphone iphone = new Iphone();

    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();

    iphone.exibirPagina();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();

    iphone.ligar();
    iphone.atender();
    iphone.selecionarMusica();

    
    }

}