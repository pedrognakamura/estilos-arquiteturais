package Abstract_Factory;

import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Único ponto que conhece as fábricas concretas. Para suportar uma nova
 * plataforma, basta criar a fábrica e registrá-la aqui; Aplicacao e Main
 * não mudam.
 */
public final class FactoryRegistry {

    private static final Map<String, Supplier<Factory>> factories = Map.of(
            "ios", FactoryIOS::new,
            "android", FactoryANDROID::new
    );

    private FactoryRegistry() {
    }

    public static Factory obterFactory(String tipo) {
        Supplier<Factory> criador = factories.get(tipo.toLowerCase(Locale.ROOT));

        if (criador == null) {
            throw new IllegalArgumentException("Plataforma não suportada: " + tipo);
        }

        return criador.get();
    }
}
