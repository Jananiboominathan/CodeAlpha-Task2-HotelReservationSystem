public class BookingMethod {
    static int suiteRoomPrice = 1500;
    static int singleRoomPrice = 1000;
    public void book(int numOfRooms, String roomType) {
        System.out.println("Booking method not written.");
    }
}
class cash extends BookingMethod {
    @Override
    public void book(int numOfRooms, String roomType) {
        int totalBill;
        if (roomType.equals("single")) {
            totalBill = numOfRooms * singleRoomPrice;
        } else {
            totalBill = numOfRooms * suiteRoomPrice;
        }
        System.out.println("totalBill Bill: " + totalBill);
        System.out.println("Cash collected.");
    }
}
class card extends BookingMethod {
    @Override
    public void book(int numOfRooms, String roomType) {
        int totalBill;
        if (roomType.equals("single")) {
            totalBill = numOfRooms * singleRoomPrice;
        } else {
            totalBill = numOfRooms * suiteRoomPrice;
        }
        System.out.println("totalBill Bill: " + totalBill);
        System.out.println("Payment successful by card.");
    }
}
class UPI extends BookingMethod {
    @Override
    public void book(int numOfRooms, String roomType) {
        int totalBill;
        if (roomType.equals("single")) {
            totalBill = numOfRooms * singleRoomPrice;
        } else {
            totalBill = numOfRooms * suiteRoomPrice;
        }
        System.out.println("totalBill Bill: " + totalBill);
        System.out.println("Payment successful by UPI.");
    }
}
    

