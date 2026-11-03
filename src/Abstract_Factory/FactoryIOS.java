package Abstract_Factory;

public class FactoryIOS implements Factory {

    @Override
    public Botao criarBotao() {
        return new BotaoIOS();
    }

    @Override
    public Input criarInput() {
        return new InputIOS();
    }
}
