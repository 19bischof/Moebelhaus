import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class run {
    public static void main(String[] args) {
//        standard();
        polymorphism();
    }


    public static void polymorphism() {
        Moebel[] Moebelarray = new Moebel[6];
        Moebelarray[0] = (new Herd(50, 85, 200));
        Moebelarray[1] = (new Herd(60, 85, 2000000));
        Moebelarray[2] = (new Geschirrspueler(60, 82, 4000));
        Moebelarray[3] = (new Schrank(60, 85));
        Moebelarray[4] = (new Schrank(60, 85));
        Moebelarray[5] = (new Schrank(60, 210));
        Kuechenzeile meineKueche = new Kuechenzeile("blau", 760, 340, Arrays.asList(Moebelarray.clone()));
        for (Moebel moebel : Moebelarray) {
            moebel.showObjectVar();
        }
    }

    public static void standard() {

        Griff black_stainless_soft_design = new Griff("noire", 20, 5, "stahl");


        Herd Gut_und_heiss = new Herd("beige", 17000, 2839, false, black_stainless_soft_design, 800);


        Geschirrspueler modern_design_cleaner = new Geschirrspueler("blue", 150, 300, true, black_stainless_soft_design, 74);

        Moebel Theke = new Moebel(420, 69);
        Moebel Hocker = new Moebel(1338, 743);

        List<Moebel> Kuechenmoebel = new ArrayList<Moebel>();
        Kuechenmoebel.add(Theke);
        Kuechenmoebel.add(Hocker);
        Kuechenmoebel.add(Gut_und_heiss);
        Kuechenmoebel.add(modern_design_cleaner);

        Kuechenzeile meineKueche = new Kuechenzeile("cream", 760, 340, Kuechenmoebel);
        meineKueche.showObjectVar();

        Monteur Dietrich = new Monteur("Dietrich", false);
        Dietrich.showObjectVar();


        Dietrich.bautMoebel(400, 25);
    }

}