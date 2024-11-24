public class Pizza extends Preparat{
    private String name;
    public Pizza(){
        super.price = 25.5;
        this.name = "Margherita";
    }
    public Pizza(double price,String name)
    {
        super(price);
        this.name = name;
    }
    public String getDetails()
    {
        return "Pizza " + this.name + ", at price " + super.price;
    }
}
