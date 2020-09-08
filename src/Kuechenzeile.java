import java.util.List;

public class Kuechenzeile {
    private String farbe;
    private int breite, hoehe;
    private Geschirrspueler spueMa;
    private Herd einHerd;
    private List<Moebel> meineMoebel;

    public Kuechenzeile(String farbe, int breite, int hoehe, Geschirrspueler spueMa, Herd einHerd, List<Moebel> meineMoebel) {
        this.farbe = farbe;
        this.breite = breite;
        this.hoehe = hoehe;
        this.spueMa = spueMa;
        this.einHerd = einHerd;
        this.meineMoebel = meineMoebel;
    }

    public void showObjectVar() {
        System.out.println(this);
    }

    //if not overwrite toString output would be name +@+ hashcode of object: "Kuechenzeile@15db9742" and not the variables


    @Override
    public String toString() {
        return "Kuechenzeile{" +
                "farbe='" + farbe + '\'' +
                ", breite=" + breite +
                ", hoehe=" + hoehe +
                ", spueMa=" + spueMa +
                ", einHerd=" + einHerd +
                ", meineMoebel=" + meineMoebel +
                '}';
    }
}
