
public class Organism {
        private int energy;
        
        public Organism() {
                this.energy = 0;
        }

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
