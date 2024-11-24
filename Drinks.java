public class Drinks extends Preparat{
    private String name;
    public Drinks(){
        super.price = 5;
        this.name = "Water";
    }
    public Drinks(String name,double price){
        super(price);
        this.name = name;
    }
    public String getDetails()
    {
        return "Drink " + this.name + ", at price " + super.price;
    }
}
