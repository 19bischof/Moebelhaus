import java.util.ArrayList;
import java.util.List;

public class Monteur {
    private String name;
    private boolean verfuegbar;

    public Monteur(String name, boolean verfuegbar) {
        this.name = name;
        this.verfuegbar = verfuegbar;
    }
    public Moebel bautMoebel( int breite, int hoehe){
        Moebel meinMoebel = null;
        if(verfuegbar)
            meinMoebel = new Moebel(breite,hoehe) ;
        else{
            System.out.println("Monteur zurzeit nicht verfuegbar");

        }

        return meinMoebel;
    }

    public Moebel bautMoebel(String farbe, int breite, int hoehe, boolean offen, Griff einGriff) {
        Moebel meinMoebel = null;
        if (verfuegbar) {
            meinMoebel = new Moebel(farbe, breite, hoehe, offen, einGriff);
        }else{
            System.out.println("Monteur zurzeit nicht verfuegbar");
        }
        return meinMoebel;
    }

    public String getName() {
        return name;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }
    public boolean getVerfuegbar(){
        return this.verfuegbar;
    }
    public void showObjectVar(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Monteur{" +
                "name='" + name + '\'' +
                ", verfuegbar=" + verfuegbar +
                '}';
    }
}
