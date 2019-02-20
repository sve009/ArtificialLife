

public class ALifeSim {
        public static void main(String[] args) {
                if (args.length != 4) {
                        throw new Error("Invalid number of arguments");
                }

                int iterations = Integer.parseInt(args[0]);

                int cooperators = Integer.parseInt(args[1]);
                int defectors = Integer.parseInt(args[2]);
                int partialCooperators = Integer.parseInt(args[3]);

                Pair<String, Integer>[] startingNumbers = (Pair<String, Integer>[]) (new Pair[3]);

                startingNumbers[0] = new Pair<String, Integer>("Cooperator", cooperators);
                startingNumbers[1] = new Pair<String, Integer>("Defector", defectors);
                startingNumbers[2] = new Pair<String, Integer>("PartialCooperator", partialCooperators);

                Population pop = new Population(startingNumbers);

                for (int i = 0; i < iterations; i++) {
                        pop.update();
                }

                Pair<String, Integer>[] finalNumbers = pop.getPopulationCounts();

                System.out.println("After " + iterations + " ticks:");
                System.out.println("Cooperators = " + finalNumbers[0].getRight());
                System.out.println("Defectors = " + finalNumbers[1].getRight());
                System.out.println("Partial Cooperators = " + finalNumbers[2].getRight());
                System.out.println("\nMean Cooperation Probability = " + pop.calculateCooperationMean());
        }
}
