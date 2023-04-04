package padroesestruturais.decorator;

public abstract class HamburguerDecorator implements Hamburguer {

    private Hamburguer hamburguer;
    public String custom;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getPrecoComida();

    public float getPreco() {
        return this.hamburguer.getPreco() + (this.getPrecoComida() );
    }

    public abstract String getCustomComida();

    public String getCustom() {
        return this.hamburguer.getCustom() + "/" + (this.getCustomComida() );
    }
}


