import java.util.ArrayList;

public class Main {

    public void main(){
        //Opgave 1
        /*
        Room openLearning = new Room("Open Learning");
        openLearning.addLamp(new Lamp(20));
        openLearning.addLamp(new Lamp(40));
        openLearning.addWindow(new Window(120,200));

        Room elevator = new Room("Elevator");
        elevator.addLamp(new Lamp(5));
        elevator.addLamp(new Lamp(5));
        elevator.addWindow(new Window(2,1));

        Room cafeteria = new Room("Cafeteria");
        cafeteria.addLamp(new Lamp(40));
        cafeteria.addLamp(new Lamp(50));
        cafeteria.addWindow(new Window(50,50));


        Building erhverakademietKøbenhavn = new Building("Erhverakademiet København");

        erhverakademietKøbenhavn.addRoom(openLearning);
        erhverakademietKøbenhavn.addRoom(elevator);
        erhverakademietKøbenhavn.addRoom(cafeteria);

        erhverakademietKøbenhavn.printBuilding();

         */

        //Opgave 2

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 80));
        animals.add(new Lion("Mufasa", 90));
        animals.add(new Wolf("Problem Ulv", 100));
        animals.add(new Rabbit("Adolf", 150));

        for (int i = 0; i < animals.size() - 2; i +=2) {
            Animal a = animals.get(i);
            Animal b = animals.get(i + 1);

            System.out.println("=== " + a.getName() + " vs " + b.getName() + " ===");

            Contest contest = new Contest(a, b);
            while (contest.getWinner() == null) {
                contest.playRound();
            }

            System.out.println("Winner: " + contest.getWinner());
            System.out.println();


        }
    }
}
