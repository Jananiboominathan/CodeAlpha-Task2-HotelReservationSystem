public class Room {
    private int avaRooms;
    private final int price;
    private final String roomType;
    public Room(int avaRooms, int price, String roomType) {
        this.avaRooms = avaRooms;
        this.price = price;
        this.roomType = roomType;
    }
    public void bookRoom(int numberOfRooms) {
        if (numberOfRooms > avaRooms) {
            System.out.println("Sorry, not enough " + roomType + " rooms available.");
        } else {
            avaRooms -= numberOfRooms;
            System.out.println(numberOfRooms + " " + roomType + " room(s) booked. Available rooms: " + avaRooms);
        }
    }
    public int calculatePrice(int numberOfRooms) {
        return numberOfRooms * price;
    }
    public String getRoomType() {
        return roomType;
    }
}
