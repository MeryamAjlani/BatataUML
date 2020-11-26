public class FraiseFraiche extends DecorateurTopping{
    public FraiseFraiche(Produit c){
        super(c);
    }
    public float cout(){
        return (float) (super.cout()+1);
    }
    public String description(){
        return super.description()+ " au coulis de fraises fraiches ";
    }
}
