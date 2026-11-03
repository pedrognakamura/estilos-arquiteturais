package Factory_Method;

public class EnvioSMS implements IntNotificacoes {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por SMS...");
    }
}
