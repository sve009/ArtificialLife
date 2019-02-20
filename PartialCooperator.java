import java.util.Random;


public class PartialCooperator extends Organism {
        private Random rand; 

        public PartialCooperator() {
                super();
                rand = new Random();
        }

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
