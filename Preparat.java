public abstract class Preparat {
    protected double price;
    public Preparat()
    {
        this.price = 0;
    }
    public Preparat(double price)
    {
        this.price = price;
    }
    public abstract String getDetails();
}
