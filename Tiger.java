public class Tiger extends Feline{
    public void huntAlone(){
        System.out.println("maverick");
    }

    public void swim(){
        System.out.println("swimming");
    }

    public void speak(){
        System.out.println("roar");
    }

    public Tiger(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }
    public Tiger(){
        super();
    }
}
