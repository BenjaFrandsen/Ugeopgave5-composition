import java.util.ArrayList;

public class Building {

    private String name;
    ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalLampCount(){
        int total = 0;
        for(Room r: rooms) {
            total += getTotalLampCount();
        }   return  total;
    }

    public int getTotalWatt(){
        int total = 0;
        for(Room r: rooms) {
            total += getTotalWatt();
        }   return  total;
    }

    public void printBuilding(){
        System.out.println("Total Rooms: " + rooms.size());
        for (Room r: rooms) {
            r.printRoom();
            System.out.println();
        }
    }



}
