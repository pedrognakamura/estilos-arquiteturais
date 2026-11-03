package Factory_Method;

public class Main {
    public static void main(String[] args) {
        FactoryNotificacoesRegistry.obterFactory("email").notificar();
        FactoryNotificacoesRegistry.obterFactory("sms").notificar();

        new FactorySMS().notificar();
        new FactoryEmail().notificar();
    }
}
