public class Freund {

    private String name;
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }



    public Freund(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Freund: "+ this.name+" ";
    }
}