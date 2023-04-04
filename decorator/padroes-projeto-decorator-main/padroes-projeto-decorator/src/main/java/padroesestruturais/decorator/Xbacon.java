package padroesestruturais.decorator;

public class Xbacon extends HamburguerDecorator {

    public Xbacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPrecoComida() {
        return 15;
    }

    public String getCustomComida() {
        return "Xbacon";
    }
}
