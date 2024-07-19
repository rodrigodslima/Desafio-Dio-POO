package iphone;

import aparelho.AparelhoTelefonico;
import navegador.NavegadorNaInternet;
import reprodutor.ReprodutorMusical;

public class Iphone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar() {
        
        System.out.println("ligando");
    }

    @Override
    public void atender() {
        System.out.println("atendendo");
        
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    
}
