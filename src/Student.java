public class Student
{
    private String name;
    private int matrikelnummer;
    private int jahrgang;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public int getJahrgang()
    {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang)
    {
        this.jahrgang = jahrgang;
    }




    public Student(String name, int matrikelnummer, int jahrgang)
    {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    @Override  // überschreibt die vorherige Methode,
    public String toString() { //STring - will später ja einen Text ausgeben
        return "Name =" + this.name + ", Matrikelnummer = " + this.matrikelnummer + ", Jahrgang = "  + this.jahrgang; //return weil ich ja was zurückbekommen will
    }
}
