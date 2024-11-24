public class Desert extends Preparat{
    private String name;
    public Desert()
    {
        super.price = 10.0;
        this.name = "Ice-cream";
    }
    public Desert(String name,double price){
        super.price = price;
        this.name = name;
    }
    public String getDetails()
    {
        return "Desert " + this.name + ", at price " + super.price;
    }
}
