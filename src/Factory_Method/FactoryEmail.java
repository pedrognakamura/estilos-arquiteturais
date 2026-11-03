package Factory_Method;

public class FactoryEmail extends FactoryNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}
