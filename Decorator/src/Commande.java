import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;


public class Commande {
    private ArrayList<Produit> lesCoupes = new ArrayList<Produit>();
    public void publieFacture() {
        float total = 0;
        for (Iterator it = this.lesCoupes.iterator(); it.hasNext();) {
            Produit coupe = (Produit) it.next();
            System.out.println(coupe.description()+" + "+coupe.cout());
            total = total + coupe.cout();
        }
        System.out.println(" TOTAL : "+total);
    }
    public Commande(ArrayList<Produit> e){
        this.lesCoupes=e;
    }
//on a utilisé la Console dy system pour avoir l'affichage
}
