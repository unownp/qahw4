package main.java.np.qa.lesson4;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Elevator elevator = new Elevator();
        human.setName("Олег");
        human.setNeсessaryFloor(25);
        human.setWeight(100);
        elevator.setMaxFloor(10);
        elevator.setMaxWeight(200);

        human.checkName(human);
        human.checkDestiny(human, elevator);


    }
}
