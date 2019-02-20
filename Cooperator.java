
/**
 * A subclass of organism that always 
 * cooperates. 
 * Methods are modified to suit.
 */
public class Cooperator extends Organism {

  //Constructor-----------------------------

  public Cooperator() {
    super();
  }

  //Methods---------------------------------

  @Override
  public String getType() {
    return "Cooperator";
  }

  @Override
  public Organism reproduce() {
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
