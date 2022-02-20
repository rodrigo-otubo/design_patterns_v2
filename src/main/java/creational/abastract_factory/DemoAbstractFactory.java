package creational.abastract_factory;

public class DemoAbstractFactory {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        var osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        var app = configureApplication();
        app.paint();
    }

}
