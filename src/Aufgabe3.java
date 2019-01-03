import javax.swing.*;

public class Aufgabe3
{
    public static void main(String[] args)
    {
        int[] array;
        int length = 100;
        array = new int[length];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }


    }

}
