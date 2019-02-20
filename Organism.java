
/**
 * A generic Organism class that 
 * tracks energy and offers a variety
 * of functions.
 * Methods are rather self-explanatory
 * The last 4 must be overwritten
 */
public class Organism {
  //fields----------------
  
  private int energy;

  //Constructor-------------
  
  public Organism() {
    this.energy = 0;
  }

  //Methods------------------

  public void update() {
    this.energy++;
  }

  public int getEnergy() {
    return this.energy;
  }

  public void incrementEnergy() {
    this.energy++;
  }

  public void decrementEnergy() {
    this.energy--;
  }

  public String getType() {
    return "Organism";
  }

  public Organism reproduce() {
    return new Organism();
  }

  public double getCooperationProbability() {
    return 1;
  }

  public boolean cooperates() {
    return true;
  }
}
