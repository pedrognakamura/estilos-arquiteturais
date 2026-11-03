package Abstract_Factory;

public class FactoryANDROID implements Factory {

    @Override
    public Botao criarBotao() {
        return new BotaoANDROID();
    }

    @Override
    public Input criarInput() {
        return new InputANDROID();
    }
}
