public class Chantilly extends DecorateurTopping {
    public Chantilly(Produit c){
        super(c);
    }
    public float cout(){
        return (float) (super.cout()+0.5);
    }
    public String description(){
        return super.description()+ " chantilly ";
    }
}
