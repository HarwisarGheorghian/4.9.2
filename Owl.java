public class Owl extends Animal{
    public void hunt(){
        System.out.println("I, additionally to living, do a moderate amount of hunting.");
    }

    public Owl(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
      }
}
