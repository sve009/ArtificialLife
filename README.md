# ArtificialLife
A simple program designed to simulate simple artificial life through monitoring the flow of energy and reproduction.

# Authors
Sam Rowekamp and Sam Eagen

# Sources
https://stackoverflow.com/questions/4040001/creating-random-numbers-with-no-duplicates. 

# Results Discussion

For the mutation adaptation to the program, we predicted that there would be little to no discernible change in the output. This is due to the fact that in order to model real life, we gave Organisms a very low probability of mutating on any given reproduction. As expected, the outputs for our various tests remained essentially the same as before we made the changes to method reproduce(). The only difference that was noticeable was that because the PartialCooperators were twice as likely to mutate, they disappeared from the Population more rapidly.

For the selective replacement adaptation to our program, we predicted again that there would be little to no discernible change in the output. This is due to the fact that replacing the lowest-energy Organisms would not have much of an impact because those Organisms had likely recently reproduced or cooperated. As expected, we saw relatively little change to the output from before we made the changes to how replacement happened.
