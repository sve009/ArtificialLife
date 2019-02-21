# ArtificialLife
A simple program designed to simulate simple artificial life through monitoring the flow of energy and reproduction.

# Authors
Sam Rowekamp and Sam Eagen

# Predictions
Defectors will be much more effective at reproducing than collaborators because they can benefit from collaborators and don't have to give up energy.

# Results
First, the experiments all had homogenous results after implementing the change to remove the lowest energy organism. 

### Experiment 1 (Population 10, 9 Cooperators, 1 Defector)
The test log is found in testing/pop10coop9.txt. The average cooperation score was 1.0 across all 10 trials.

### Experiment 2 (Population 10, 1 Cooperators, 9 Defectors)
The test log is found in testing/pop10coop1.txt. The average cooperation score was 0.0 across all 10 trials.

### Experiment 3 (Population 10, 3 Cooperators, 3 Defectors, 4 PartialCooperators)
The test log is found in testing/pop10coop3.txt. The average cooperation score was 0.0 across all 10 trials.

### Experiment 4 (Population 100, 99 Cooperators, 1 Defector)
The test log is found in testing/pop100coop99.txt. The average cooperation score was 1.0 across all 10 trials.

### Experiment 5 (Population 100, 1 Cooperators, 99 Defectors)
The test log is found in testing/pop100coop1.txt. The average cooperation score was 0.0 across all 10 trials.

### Experiment 6 (Population 100, 33 Cooperators, 33 Defectors, 34 PartialCooperators)
The test log is found in testing/pop100coop33.txt. The average cooperation score was 0.0 across all 10 trials.

# Conclusions
The more diverse populations quickly became dominated by Defectors, because Defectors did not have to expend their own energy so they were almost never the organisms with the least energy. Meanwhile, the Cooperators dominated if they started with a strong majority because it meant that on average, the Cooperators would reach 10 energy at the same time as the one Defector, and then reproduce adding 99 Cooperators while the Defector only adds one Defector. Thus, the Defectors slowly die out while the Cooperators maintain their strong lead. 

# Sources
* https://stackoverflow.com/questions/4040001/creating-random-numbers-with-no-duplicates. 
* https://www.javamex.com/tutorials/random_numbers/generators_overview.shtml. 

