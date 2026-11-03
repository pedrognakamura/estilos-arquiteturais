package Abstract_Factory;

public class InputIOS implements Input {
    @Override
    public void renderizarInput() {
        System.out.println("Renderizando input no estilo iOS.");
    }
}
