public class Moebel {
    private String farbe;
    private int breite, hoehe;
    private boolean offen;
    private Griff einGriff;


    public Moebel(String farbe, int breite, int hoehe, boolean offen, Griff einGriff) {
        this.farbe = farbe;
        this.breite = breite;
        this.hoehe = hoehe;
        this.offen = offen;
        this.einGriff = einGriff;
    }

    public Moebel(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }


    public void showObjectVar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Moebel{" +
                "farbe='" + farbe + '\'' +
                ", breite=" + breite +
                ", hoehe=" + hoehe +
                ", offen=" + offen +
                ", einGriff=" + einGriff +
                '}';
    }
}

