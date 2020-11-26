public class TripleChocolat extends CoupeGlacee{
    public static final TripleChocolat SINGLETON = new TripleChocolat();
         private TripleChocolat() {
            this.parfums.add(Parfums.CHOCOLAIT);
            this.parfums.add(Parfums.CHOCONOIR);
            this.parfums.add(Parfums.CHOCOBLANC);
        }

    public float cout() {
        return 6;
    }
}
