

public class Cooperator extends Organism {
        
        public Cooperator() {
                super();
        }

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
