import java.util.Random;

/**
 * A subclass of organism that always 
 * cooperates. 
 * Methods are modified to suit.
 */
public class Cooperator extends Organism {
  //fields---------------------------------

  private Random rand;

  //Constructor-----------------------------

  public Cooperator() {
    super();
    this.rand = new Random();
  }

  //Methods---------------------------------

  @Override
  public String getType() {
    return "Cooperator";
  }

  @Override
  public Organism reproduce() {
    //Can mutate to PartialCooperator
    if (rand.nextInt(100) == 0) {
      return new PartialCooperator();
    }
    return new Cooperator();
  }

  @Override
  public double getCooperationProbability() {
    return 1;
  }

  @Override
  public boolean cooperates() {
    return true;
  }
}
