/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public void groan()
  {
    System.out.println("The hippo groans.");
  }

  public void speak(){
    groan();
  }

  public Hippo(String food, boolean nocturnal, double aveLifeSpan){
    super(food, nocturnal, aveLifeSpan);
  }

  public Hippo(){
    super();
  }
}