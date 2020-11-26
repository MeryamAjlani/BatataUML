
import java.util.*;
enum Parfums {
    FRAMBOISE("framboise"),
    FRAISE("fraise"),
    CASSIS("cassis"),
    CHOCOLAIT("chocolat au lait"),
    CHOCOBLANC("chocolat bland"),
    CHOCONOIR("chocolat noir");
    private String name;
    private Parfums (String s) {
        this.name=s;
    }

    public String toString() {
        return this.name;
    }
}