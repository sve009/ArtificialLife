


public class Defector extends Organism {
        
        public Defector() {
                super();
        }

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
