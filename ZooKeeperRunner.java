import java.util.ArrayList;

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
       Animal elephant = new Elephant();
       Animal deer = new Deer();
       Animal giraffe = new Giraffe();
       Animal gorilla = new Gorilla();
       Animal hippo = new Hippo();
       Animal lion = new Lion();
       Animal monkey = new Monkey();
       Animal owl = new Owl();
       Animal penguin = new Penguin();
       Animal tiger = new Tiger();

       hearTheAnimal(elephant);


  }

  public static void hearTheAnimal(Animal a){
    a.speak();
  }
}