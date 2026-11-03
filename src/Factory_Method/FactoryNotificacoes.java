package Factory_Method;

/**
 * Classe base (Creator) do Factory Method. O fluxo comum fica em notificar();
 * as subclasses só decidem qual produto criar. Uma nova fábrica concreta
 * não exige editar esta classe.
 */
public abstract class FactoryNotificacoes {

    // Factory Method: cada fábrica concreta devolve seu produto.
    protected abstract IntNotificacoes criarNotificacao();

    // Fluxo comum: depende só da abstração IntNotificacoes (DIP).
    public void notificar() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }
}
