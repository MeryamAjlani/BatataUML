public class Robusta extends Cafe{
    public static final Robusta SINGLETON=new Robusta();
    public String description(){
        return super.description()+" Robusta";
    }
}
