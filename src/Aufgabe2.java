import javax.swing.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        int[] array1 = new int [Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die gewünschte Größe Ihres Arrays ein."))];

        for (int i = 0; i<array1.length; i++)
        {
            array1[i]=(int)(Math.random()*1000);
        }

        System.out.println("*** Vorwärts ***");

        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }

        System.out.println("*** Rückwärts ***");

        for (int i = array1.length-1; i >= 0; i--){
            System.out.println(array1[i]);
        }
    }
}
