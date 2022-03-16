package main.java.np.qa.lesson4;

public class Human {



   private int weight;
    private String name;
    private int neсessaryFloor;

    public int getNeсessaryFloor() {
        return neсessaryFloor;
    }

    public void setNeсessaryFloor(int neсessaryFloor) {
        this.neсessaryFloor = neсessaryFloor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkDestiny(Human human,Elevator elevator){
        if (human.getWeight()<=elevator.getMaxWeight()){
            if (human.getNeсessaryFloor()==-1){
                System.out.println(human.getName()+" попал в паркинг");
            }
            if (human.getNeсessaryFloor()<-1){
                System.out.println(human.getName()+" departed right to the hell");
            }
            if (human.getNeсessaryFloor()==0){
                System.out.println(human.getName()+" тупит в лифте");
            }
            if ((human.getNeсessaryFloor()>0)&&(human.getNeсessaryFloor()<= elevator.getMaxFloor())){
                System.out.println(human.getName()+" попал на "+human.getNeсessaryFloor()+"-й этаж");
            }
            if ((human.getNeсessaryFloor()>elevator.getMaxFloor())){
                System.out.println(human.getName()+" was thrown to the outer space");
            }
        } else
        {
            System.out.println(human.getName()+" is too fat, there are "+(human.getWeight()- elevator.getMaxWeight())+" excessive kg");
        }
    }

    public void checkName(Human human) {
        if (human.getName().equals("Олег")) {
            System.out.println("Congratulations, the name of human is Олег");
        } else
        {
            System.out.println("Congratulations, the name of human is not Олег");
        }
    }

}
