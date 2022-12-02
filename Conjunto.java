public class Conjunto implements Comparavel {
    private int elemento1;
    private int elemento2;
    public Conjunto(int a, int b){
        this.elemento1 = a;
        this.elemento2 = a;
    }
    public int soma(){
        return this.elemento1 + this.elemento2;
    }
    public String getElementos(){
        return "<" +this.elemento1 + ", " + this.elemento2;
    }

    @Override
    public boolean maior(Comparavel obj) {
        Conjunto objAsConjunto = (Conjunto) obj;
        return this.soma() > objAsConjunto.soma();
    }

    @Override
    public boolean menor(Comparavel obj) {
        Conjunto objAsConjunto = (Conjunto) obj;
        return this.soma() < objAsConjunto.soma();
    }

    @Override
    public boolean igual(Comparavel obj) {
        Conjunto objAsConjunto = (Conjunto) obj;
        return this.soma() == objAsConjunto.soma();
    }
    
}
