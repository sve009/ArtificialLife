

/**
 * A subclass of Organism that never
 * cooperates.
 * Methods are modified to suit.
 */
public class Defector extends Organism {

  //Constructor-------------------------------

  public Defector() {
    super();
  }

  //Methods-----------------------------------

  @Override
  public String getType() {
    return "Defector";
  }

  @Override
  public Organism reproduce() {
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
