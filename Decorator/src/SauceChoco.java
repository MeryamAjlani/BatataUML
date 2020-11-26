public class SauceChoco extends DecorateurTopping{
    public SauceChoco(Produit c){
        super(c);
    }
    public float cout(){
        return (float) (super.cout()+0.7);
    }
    public String description(){
        return super.description()+ " et sa délicieuse sauce chocolat ";
    }
}
