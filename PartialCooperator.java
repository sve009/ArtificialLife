import java.util.Random;

/**
 * A subclass of organism that cooperates
 * half of the time.
 * A random field has been added.
 * The methods are changed to suit.
 */
public class PartialCooperator extends Organism {
  //fields--------------------------------------------

  private Random rand; 

  //Constructor---------------------------------------

  public PartialCooperator() {
    super();
    rand = new Random();
  }

  //Methods-------------------------------------------

  @Override
  public String getType() {
    return "PartialCooperator";
  }

  @Override
  public Organism reproduce() {
    return new PartialCooperator();
  }

  @Override
  public double getCooperationProbability() {
    return .5;
  }

  @Override
  public boolean cooperates() {
    return rand.nextBoolean();
  }
}
