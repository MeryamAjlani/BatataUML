import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;


public class Commande {
    private ArrayList<CoupeGlacee> lesCoupes = new ArrayList<CoupeGlacee>();
    public void publieFacture() {
        float total = 0;
        for (Iterator it = this.lesCoupes.iterator(); it.hasNext();) {
            CoupeGlacee coupe = (CoupeGlacee) it.next();
            System.out.println(coupe.description()+" + "+coupe.cout());
            total = total + coupe.cout();
        }
        System.out.println(" TOTAL : "+total);
    }
    public Commande(ArrayList<CoupeGlacee> e){
        this.lesCoupes=e;
    }

}
