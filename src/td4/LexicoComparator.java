package td4;

import java.util.Comparator;

public class LexicoComparator implements Comparator<Vehicule> {
    @Override
    public int compare(Vehicule a, Vehicule b) {
        return a.getMarque().compareToIgnoreCase(b.getMarque());
    }
}
