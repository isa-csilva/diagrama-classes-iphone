public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para número...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionou nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizou página.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.atender();
        iPhone.ligar();
        iPhone.iniciarCorreioVoz();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}

