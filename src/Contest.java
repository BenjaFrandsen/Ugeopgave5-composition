public class Contest {

    private Animal animal1;
    private Animal animal2;
    private int rounds;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.rounds = 0;
    }

    public void playRound() {
        rounds++;
        System.out.println("Round: " + rounds);

        //animal1.setEnergy(animal1.getEnergy() - animal2.attack());
        //animal2.setEnergy(animal2.getEnergy() - animal1.attack());
        int d1 = animal1.attack();
        animal2.setEnergy(animal2.getEnergy() - d1);
        System.out.println(animal1.getName() + " attacks " + animal2.getName()
                + " for " + d1 + " (" + animal2.getEnergy() + " energy left)");

        int d2 = animal2.attack();
        animal1.setEnergy(animal1.getEnergy() - d2);
        System.out.println(animal2.getName() + " attacks " + animal1.getName()
                + " for " + d2 + " (" + animal1.getEnergy() + " energy left)");


    }

    public Animal getWinner() {
        if (animal1.isActive() && animal2.isActive()) {
            return null;
        }
        if (animal1.isActive()) {
            return animal1;
        } else return animal2;
    }

}
