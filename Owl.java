public class Owl extends Animal{
    public void hunt(){
        System.out.println("I, additionally to living, do a moderate amount of hunting.");
    }

    public void speak(){
        System.out.println("OOO OOOO");
    }

    public Owl(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }
    public Owl(){
        super();
    }
}
