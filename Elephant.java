public class Elephant extends Animal{
    public void trumpet(){
        System.out.println("RRRRRR");
    }
    
    public void forage(){
        System.out.println("forage");
    }

    public Elephant(String food, boolean nocturnal, 
                double aveLifeSpan)
    {
      super(food, nocturnal, aveLifeSpan);
    }

    public void speak(){
        trumpet();
    }

    public Elephant(){
        super();
    }
}
