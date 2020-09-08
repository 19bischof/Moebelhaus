public class Geschirrspueler extends Moebel{
    private int spuelprogramm;

    public Geschirrspueler(String farbe, int breite, int hoehe, boolean offen,Griff einGriff,int spuelprogramm) {
        super(farbe,breite,hoehe,offen,einGriff);
        this.spuelprogramm = spuelprogramm;
    }

    public  Geschirrspueler( int breite, int hoehe, int spuelprogramm) {
        super(breite,hoehe);
        this.spuelprogramm = spuelprogramm;
    }

    public int getSpuelprogramm() {
        return spuelprogramm;
    }

    public void setSpuelprogramm(int spuelprogramm) {
        this.spuelprogramm = spuelprogramm;
    }

    public void showObjectVar() {
        super.showObjectVar();
    }

    @Override
    public String toString() {
        return "Geschirrspueler{" +
                "spuelprogramm=" + spuelprogramm +
                "} " + super.toString();
    }
}
