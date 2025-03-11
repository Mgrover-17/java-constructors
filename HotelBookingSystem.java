public class HotelBookingSystem {
    String guestName;
    String roomType;
    int nights;

    HotelBookingSystem(){
        this.guestName = "Rhea";
        this.roomType = "Standard";
        this.nights = 1;
    }

    HotelBookingSystem(String guestName, String roomType, int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }

    HotelBookingSystem(HotelBookingSystem other){
        this.guestName=other.guestName;
        this.roomType=other.roomType;
        this.nights=other.nights;
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBookingSystem obj1=new HotelBookingSystem();
        HotelBookingSystem obj2=new HotelBookingSystem("Janvi", "Deluxe", 2);
        HotelBookingSystem obj3=new HotelBookingSystem(obj2);
        System.out.println("Default Booking:");
        obj1.displayBooking();
        System.out.println("Parameterized Booking:");
        obj2.displayBooking();
        System.out.println("Copied Booking:");
        obj3.displayBooking();
    }
}
