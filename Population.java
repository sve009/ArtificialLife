import java.util.ArrayList;
import java.util.Collections;

public class Population {
  ArrayList<Organism> pop;

  public Population(Pair<String, Integer>[] counts) throws IllegalArgumentException {
    pop = new ArrayList<Organism>();
    for (int i = 0; i < counts.length; i++) {
      for (int j = 0; j < counts[i].getRight(); j++) {
        if (counts[i].getLeft().equals("Cooperator")) {
          Organism newOrg = new Cooperator();
          pop.add(newOrg);
        } // if
        else if (counts[i].getLeft().equals("Defector")) {
          Organism newOrg = new Defector();
          pop.add(newOrg);
        } // else if
        else if (counts[i].getLeft().equals("PartialCooperator")) {
          Organism newOrg = new PartialCooperator();
          pop.add(newOrg);
        } // else if
      } // for
    } // for
  } // Population

  public void update() {
    for (int i = 0; i < this.pop.size(); i++) {
      Organism thisOrg = this.pop.get(i);
      thisOrg.update();
      // Bonus
      if (thisOrg.cooperates()) {
        thisOrg.decrementEnergy();
        Collections.shuffle(pop);
        for (int j = 0; j < 8; j++) {
          this.pop.get(j).incrementEnergy();
        } // for
      } // if
      // Bonus
      if (thisOrg.getEnergy() >= 10) {
        int lowestEnergy = this.pop.get(0).getEnergy();
        int lowestOrgIndex = 0;
        int thisEnergy;
        for (int k = 0; k < this.pop.size(); k++) {
          thisEnergy = this.pop.get(k).getEnergy();
          if (thisEnergy < lowestEnergy) {
            lowestOrgIndex = k;
            lowestEnergy = thisEnergy;
          }
        }
        this.pop.set(lowestOrgIndex, thisOrg);
        // Random randomGenerator = new Random();
        // int randomInt = randomGenerator.nextInt(this.pop.size());
        // this.pop.set(randomInt, thisOrg.reproduce());
      } // if
    } // for
  } // method update()

  public double calculateCooperationMean() {
    double coopSum = 0;
    for (int i = 0; i < this.pop.size(); i++) {
      coopSum = coopSum + pop.get(i).getCooperationProbability();
    }
    return coopSum / this.pop.size();
  }

  public Pair<String, Integer>[] getPopulationCounts() {
    // Create array of Pairs to return
    Pair<String, Integer>[] counts = (Pair<String, Integer>[]) (new Pair[3]);
    // Set up counts for each of the types of Organisms
    counts[0] = new Pair<String, Integer>("Cooperator", 0);
    counts[1] = new Pair<String, Integer>("Defector", 0);
    counts[2] = new Pair<String, Integer>("PartialCooperator", 0);
    // Loop through the entire population
    for (int i = 0; i < this.pop.size(); i++) {
      // Find the type of the current Organism
      String type = this.pop.get(i).getType();
      // Check if the current Organism is a Cooperator
      if (type.equals("Cooperator")) {
        counts[0].right = counts[0].getRight() + 1;
      } // if
      // Check if the current Organism is a Defector
      else if (type.equals("Defector")) {
        counts[1].right = counts[1].getRight() + 1;
      } // else if
      // Check if the current Organism is a PartialCooperator
      else if (type.equals("PartialCooperator")) {
        counts[2].right = counts[2].getRight() + 1;
      } // else if
    } // for
    return counts;
  }
}
