import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        int[] array1 = new int[Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die gewünschte Größe Ihres Arrays ein."))];
        //der Nutzer wird nach der größe des Arrays gefragt, deshalb Integer.parseInt wegen dem umwandln
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = (int) (Math.random() * 1000);
        }
                    /*mit i=0 wird angegeben ab wann gestartet werden kann,
            i<array.length ist die Aussage/Bedingung wird angegeben das i kleiner als die eingegebene Größe (vom Benutzer eingegebn)sein soll
            i++ -Zählmechanismus wird angegeben dass immer eine Zahl dazu gegeben werden soll*/

        /*mit der Eingabe darunter wird gesagt, dass die Obergrenze des Zahlenwerts der Zufallszahl nicht 1000 oder mehr sein darf/kann, mit der MEthode Math.Random soll die Zufallszahl generiert werden*/

       System.out.println("Vorwärts"); //DAmit ich danach weiß dass die Vorwärtsversion kommt

        for (int i = 0; i < array1.length; i++) //werden die Zahlen (die bei der vorherigen Schleife abgefragt wurden) ausgegebn
        {
            System.out.println(array1[i]);
        }

        System.out.println("Rückwärts"); //DAmit ich danach weiß dass die Rückwärtsversion kommt

        for (int i = array1.length - 1; i >= 0; i--)//werden die Zahlen die davor vorwärts ausgegebn wurden einfach rückwärts angegebn
        {
            System.out.println(array1[i]);
        }
    }
}
