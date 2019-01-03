
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe4 {

    private static List<Freund> freundesListe = new ArrayList<>();

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++){
            freundesListe.add(new Freund(JOptionPane.showInputDialog(i+1 + ". Freund eingeben")));
        }

        for(int i = 0; i < 5; i++){
            System.out.print(freundesListe.get(i).toString());
        }
    }
}