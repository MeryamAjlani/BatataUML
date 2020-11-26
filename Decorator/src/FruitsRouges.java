import java.util.ArrayList;

public class FruitsRouges extends CoupeGlacee {
    public static final FruitsRouges SINGLETON = new FruitsRouges();
    private FruitsRouges() {
        this.parfums.add(Parfums.FRAISE);
        this.parfums.add(Parfums.FRAMBOISE);
        this.parfums.add(Parfums.CASSIS);
    }
    public float cout() {
        return 6;
    }
}
