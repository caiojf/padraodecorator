package padroesestruturais.decorator;

public class Xburguer extends HamburguerDecorator {

    public Xburguer(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getPrecoComida() {
        return 10;
    }

    public String getCustomComida() {
        return "Xburguer";
    }
}
