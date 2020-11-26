public class DecorateurTopping extends CoupeGlacee{
    private CoupeGlacee coupe;
    public DecorateurTopping(CoupeGlacee c){
        this.coupe=c;
    }
    public float cout(){
        return coupe.cout();
    }
    public String description(){
       return coupe.description();
    }
}
