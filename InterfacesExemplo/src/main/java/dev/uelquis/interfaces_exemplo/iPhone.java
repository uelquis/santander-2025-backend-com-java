package dev.uelquis.interfaces_exemplo;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
    String musicaAtual = "";

    iPhone() {}

    @Override
    public void tocar() {
        if(musicaAtual.isEmpty()) {
            System.out.println("nenhuma musica selecionada!");
            return;
        }
        System.out.println("tocando " + musicaAtual);
    }

    @Override
    public void pausar() {
        if(musicaAtual.isEmpty()) {
            System.out.println("nenhuma musica selecionada!");
            return;
        }
        System.out.println("pausou " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String music) {
        musicaAtual = music;
        System.out.println("selecionou " + musicaAtual);
    }

    @Override
    public void ligar(String numeroDeTelefone) {
        System.out.println("ligando para " + numeroDeTelefone );
    }

    @Override
    public void atender() {
        System.out.println("atendeu chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("inicou correio veloz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionou nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizou pagina");
    }
}
