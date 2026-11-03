package Factory_Method;

public class FactorySMS extends FactoryNotificacoes {
    @Override
    protected IntNotificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}
