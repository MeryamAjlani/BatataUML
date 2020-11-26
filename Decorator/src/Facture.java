import java.util.ArrayList;
import java.io.*;
public class Facture {
    public static void main( String[] args){
        FruitsRouges coupe1 = FruitsRouges.SINGLETON;
        TripleChocolat coupe2 = TripleChocolat.SINGLETON;
        DecorateurTopping deccoupe1 = new DecorateurTopping(new Chantilly(new SauceChoco(coupe1)));
        DecorateurTopping deccoupe2 = new DecorateurTopping(new Chantilly(new SauceChoco(new FraiseFraiche(coupe2))));
        ArrayList<CoupeGlacee> e = new ArrayList<CoupeGlacee>();
        e.add(deccoupe1);
        e.add(deccoupe2);
        Commande com = new Commande(e);
        com.publieFacture();
    }
}
