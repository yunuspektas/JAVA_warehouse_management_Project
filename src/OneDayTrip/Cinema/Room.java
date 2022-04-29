package OneDayTrip.Cinema;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    public List<Integer> secilenKoltukNumaralari = new ArrayList<>();
    static Map<String, Room> roomMap = new HashMap<>();
    private int bosKoltukSayisi = 25;

    public Room() {
    }

//    public Room(int bosKoltukSayisi) {
//        this.bosKoltukSayisi = bosKoltukSayisi;
//    }

    public static void initializeRooms() {
        Room Room1 = new Room();
        Room Room2 = new Room();
        Room Room3 = new Room();
        Room Room4 = new Room();
        Room Room5 = new Room();
        roomMap.put("Room1", Room1);
        roomMap.put("Room2", Room2);
        roomMap.put("Room3", Room3);
        roomMap.put("Room4", Room4);
        roomMap.put("Room5", Room5);
    }


    public int getBosKoltukSayisi() {
        return bosKoltukSayisi;
    }

    public void setBosKoltukSayisi(int bosKoltukSayisi) {
        this.bosKoltukSayisi = bosKoltukSayisi;
    }

//    public List<Integer> getSecilenKoltukNumaralari() {
//        return secilenKoltukNumaralari;
//    }


}
