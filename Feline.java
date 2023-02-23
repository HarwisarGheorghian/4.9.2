public class Feline extends Animal{
    public void roar(){
        System.out.println("r");
    }

    public void growl(){
        System.out.println("grrr");
    }

    public Feline(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }

    public Feline(){
        super();
    }
}
