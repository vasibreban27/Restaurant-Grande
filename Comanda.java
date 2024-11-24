
public class Comanda {
    public Preparat[] preparate = new Preparat[10];;
    public int n = 0;
    public String status;
    public Comanda() {
        status = "In asteptare";
    }
    public Comanda(Preparat preparat,String status) {
        this.status = status;
        this.addPreparat(preparat);
    }
    public void addPreparat(Preparat p)
    {
        if(n < preparate.length)
        {
            preparate[n++] = p;
        }
        else
        {
            System.out.println("Preparat full");
        }
    }
    public void listPreparate()
    {
        for(Preparat p: preparate)
        {
            if(p != null)
            {
                System.out.println(p.getDetails());
            }
        }
    }
    public void listPizza()
    {
        for(Preparat p: preparate)
        {
            if(p!=null && p instanceof Pizza)
            {
                System.out.println(p.getDetails());
            }
        }
    }

    public void listDrinks()
    {
        for(Preparat p: preparate)
        {
            if(p!=null && p instanceof Drinks)
                System.out.println(p.getDetails());
        }
    }

    public void listDesert()
    {
        for(Preparat p: preparate)
        {
            if(p!=null && p instanceof Desert)
                System.out.println(p.getDetails());
        }
    }
    public double totalPrice()
    {
        double total = 0;
        for(Preparat p: preparate)
        {
            if(p!=null)
            {
                total = total + p.price;
            }
        }
        return total;
    }
    public String getStatus()
    {
        return this.status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public String getDetails() {
        String details = "Comanda cu statusul " + status + ":\n";
        for (Preparat p : preparate) {
            if (p != null) {
                details += " - " + p.getDetails() ;
            }
        }
        return details;
    }
    public static void listComandaStatus(Comanda[] comenzi)
    {
        System.out.println("Comenzi nelivrate: ");
        for(Comanda com:comenzi)
        {
            if(com!=null && com.getStatus().equals("In asteptare"))
            {
                System.out.println(com.getDetails());
                System.out.println("Status " + com.getStatus() + " - Total: " + com.totalPrice() + " lei");
            }
        }
    }
}
