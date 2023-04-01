

interface Button {
    void paint();
}

class WindowsButton implements Button {
    public void paint() {
        System.out.println("Windows button painted.");
    }
}


class MacOSButton implements Button {
    public void paint() {
        System.out.println("MacOS button painted.");
    }
}

interface Checkbox {
    void paint();
}

class WindowsCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Windows checkbox painted.");
    }
}

class MacOSCheckbox implements Checkbox {
    public void paint() {
        System.out.println("MacOS checkbox painted.");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton();
    }
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

class Client {
    private Button button;
    private Checkbox checkbox;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
    public static void main(String[] agrs) {
        Client windowsClient = new Client(new WindowsFactory());
        windowsClient.paint();

        Client macClient = new Client(new MacOSFactory());
        macClient.paint();
    }
}