
package bl;

import java.io.Serializable;

/**
 *
 * @author Matthias
 */
public class Sender implements Serializable{
    private transient String name;
    private double frequenz;
    private String band;

    public Sender(String name, double frequenz, String band) {
        this.name = name;
        this.frequenz = frequenz;
        this.band = band;
    }

    public String getName() {
        return name;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public String getBand() {
        return band;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f,%s", name, frequenz, band);
    }
    
    
}
