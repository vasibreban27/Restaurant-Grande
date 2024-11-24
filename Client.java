public class Client {
    private String name;
    private Comanda[] comenzi = new Comanda[10];
    public int n=0;
    public Client(String name) {
        this.name = name;
    }
    public Client()
    {
        this.name = "George";
    }
    public void addComenzi(Comanda com)
    {
        if(n<comenzi.length)
        {
            comenzi[n++] = com;
        }
        else
        {
            System.out.println("NU mai sunt comenzi disponibile");
        }

    }
    public void totalSum()
    {
        double total = 0;
        for(int i = 0; i < comenzi.length; i++)
        {
            if(comenzi[i] != null)
                total = total + comenzi[i].totalPrice();
        }
        System.out.println("Total sum for a client is: " + total);
    }
}
