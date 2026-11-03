package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        String tipo = args.length > 0 ? args[0] : "ANDROID";

        Factory factory = FactoryRegistry.obterFactory(tipo);

        Aplicacao app = new Aplicacao(factory);

        app.renderizar();
    }
}
