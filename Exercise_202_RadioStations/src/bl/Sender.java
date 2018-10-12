
package bl;

/**
 *
 * @author Matthias
 */
public class Sender {
    private String name;
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
    
    
}
