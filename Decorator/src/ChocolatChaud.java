public class ChocolatChaud extends Boisson {
    public static final ChocolatChaud SINGLETON=new ChocolatChaud();
    public String description(){
        return "Chocolat Chaud";
    }
    public float cout() {
        return 2.0f;
    }
}
