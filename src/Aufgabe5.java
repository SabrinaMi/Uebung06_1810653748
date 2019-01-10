import java.util.ArrayList;
import java.util.List;

public class Aufgabe5 {
    public static void main(String[] args) {

        List<Student> studiListe = new ArrayList<>(); //<>bezieht sich auf die Klasse Student,
        studiListe.add(new Student("Sabrina",748,1993)); //add = hinzufügen zur ArrayList
        studiListe.add(new Student("Nina",169,1997));
        studiListe.add(new Student("Maria",657,1994));

        for (Student s : studiListe){   //for each Schleife, greift automatisch auf die StudentenKlasse zu, : für jeden Studenten in dieser Liste mach das....
            System.out.println(s.toString()); //damit ich eine schönere Formatierung habe mit =
        }
    }
}