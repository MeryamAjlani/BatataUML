public class Arabica extends Cafe {
    public static final Arabica SINGLETON=new Arabica();
    public String description(){
        return super.description()+" Arabica ";
    }
}
