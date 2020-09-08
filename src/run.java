import java.util.ArrayList;
import java.util.List;

public class run {
    public static void main(String[] args) {


        Griff black_stainless_soft_design = new Griff("noire",20,5,"stahl");
        

        Herd Gut_und_heiss = new Herd("beige",17000,2839,false,black_stainless_soft_design,800);



        Geschirrspueler modern_design_cleaner = new Geschirrspueler("blue",150,300,true,black_stainless_soft_design,74);

        Moebel Theke = new Moebel(420,69);
        Moebel Hocker = new Moebel(1338,743);

        List<Moebel> Kuechenmoebel = new ArrayList<Moebel>();
        Kuechenmoebel.add(Theke);
        Kuechenmoebel.add(Hocker);

        Kuechenzeile meineKueche = new Kuechenzeile("cream",760,340,modern_design_cleaner,Gut_und_heiss,Kuechenmoebel);
        meineKueche.showObjectVar();

        Monteur Dietrich = new Monteur("Dietrich",false);
        Dietrich.showObjectVar();


        Dietrich.bautMoebel(400,25);
    }
}
