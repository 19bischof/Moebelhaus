public class Griff {
    private String farbe;
    private String material;
    private int breite, hoehe;

    public Griff(String farbe, int breite, int hoehe, String material) {
        this.farbe = farbe;
        this.breite = breite;
        this.hoehe = hoehe;
        this.material = material;
    }

    public void showObjectVar() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Griff{" +
                "farbe='" + farbe +
                ", breite=" + breite +
                ", hoehe=" + hoehe +
                ", material=" + material +
                '}';
    }
}
