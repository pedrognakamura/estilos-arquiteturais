package Abstract_Factory;

public class BotaoIOS implements Botao {
    @Override
    public void renderizarBotao() {
        System.out.println("Renderizando botão no estilo iOS.");
    }
}
