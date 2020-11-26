public class DecorateurTopping implements Produit{
    private Produit p;
    public DecorateurTopping(Produit p){
        this.p=p;
    }
    public float cout(){
        return p.cout();
    }
    public String description(){
       return p.description();
    }
}
