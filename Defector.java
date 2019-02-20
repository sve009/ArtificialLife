import java.util.Random;

/**
 * A subclass of Organism that never
 * cooperates.
 * Methods are modified to suit.
 */
public class Defector extends Organism {
  //fields-----------------------------------

  private Random rand;

  //Constructor-------------------------------

  public Defector() {
    super();
    this.rand = new Random();
  }

  //Methods-----------------------------------

  @Override
  public String getType() {
    return "Defector";
  }

  @Override
  public Organism reproduce() {
    //Can mutate to PartialCooperator
    if (rand.nextInt(1000) == 0) {
      return new PartialCooperator();
    }
    return new Defector();
  }

  @Override
  public double getCooperationProbability() {
    return 0;
  }

  @Override
  public boolean cooperates() {
    return false;
  }
}
