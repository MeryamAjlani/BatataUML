import java.util.ArrayList;
import java.io.*;
public class Facture {
    public static void main( String[] args){
        FruitsRouges coupe1 = FruitsRouges.SINGLETON;
        TripleChocolat coupe2 = TripleChocolat.SINGLETON;
        ChocolatChaud choco = ChocolatChaud.SINGLETON;
        Arabica ara=Arabica.SINGLETON;
        Robusta rob=Robusta.SINGLETON;
        DecorateurTopping deccoupe1 = new DecorateurTopping(new Chantilly(new SauceChoco(coupe1)));
        DecorateurTopping deccoupe2 = new DecorateurTopping(new Chantilly(new SauceChoco(new FraiseFraiche(coupe2))));
        ArrayList<Produit> e = new ArrayList<Produit>();
        e.add(deccoupe1);
        e.add(deccoupe2);
        DecorateurTopping cafe1 = new DecorateurTopping(new Chantilly(ara));
        DecorateurTopping cafe2 = new DecorateurTopping(new Chantilly(rob));
        DecorateurTopping choco2= new DecorateurTopping(new Chantilly(choco));
        e.add(cafe1);
        e.add(cafe2);
        e.add(choco2);
        Commande com = new Commande(e);
        com.publieFacture();
    }
}
