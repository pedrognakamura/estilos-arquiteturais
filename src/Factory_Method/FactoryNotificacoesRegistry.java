package Factory_Method;

import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Seleciona a fábrica pelo tipo sem if/else: basta registrar uma nova
 * fábrica concreta no mapa.
 */
public final class FactoryNotificacoesRegistry {

    private static final Map<String, Supplier<FactoryNotificacoes>> factories = Map.of(
            "email", FactoryEmail::new,
            "sms", FactorySMS::new
    );

    private FactoryNotificacoesRegistry() {
    }

    public static FactoryNotificacoes obterFactory(String tipo) {
        Supplier<FactoryNotificacoes> criador = factories.get(tipo.toLowerCase(Locale.ROOT));

        if (criador == null) {
            throw new IllegalArgumentException("Tipo de notificação inválido: " + tipo);
        }

        return criador.get();
    }
}
