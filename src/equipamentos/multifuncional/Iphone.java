package equipamentos.multifuncional;

import equipamentos.navegador.INavegadorInternet;
import equipamentos.player.IReprodutorMusical;
import equipamentos.telefone.IAparelhoTelefonico;

public class Iphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {

    @Override
    public void exibirPagina() {
        System.out.println("Navegador Internet: exibindo Pagina (via Iphone)");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador Internet: adicionando Nova Aba (via Iphone)");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador Internet: atualizando Pagina (via Iphone)");
    }

    @Override
    public void ligar() {
        System.out.println("Aparelho Telefônico: realizando chamada (via Iphone)");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho Telefônico: atendendo chamada (via Iphone)");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Aparelho Telefônico: correio de voz iniciado (via Iphone)");
    }

    @Override
    public void tocar() {
        System.out.println("Reprodutor Musical: Tocando musica.. (via Iphone)");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor Musical: A musica foi pausada.. (via Iphone)");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Reprodutor Musical: Musica selecionada.. (via Iphone)");
    }
}
