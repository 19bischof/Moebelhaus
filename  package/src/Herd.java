public class Herd extends Moebel{
    private int temperatur;

    public Herd(String farbe, int breite, int hoehe, boolean offen,Griff einGriff,int temperatur) {
        super(farbe,breite,hoehe,offen,einGriff);
        this.temperatur = temperatur;

    }
    public  Herd( int breite, int hoehe, int temperatur) {
        super(breite,hoehe);
        this.temperatur = temperatur;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public void showObjectVar() {
        super.showObjectVar();
    }

    @Override
    public String toString() {
        return "Herd{" +
                "temperatur=" + temperatur +
                "} " + super.toString();
    }
}
