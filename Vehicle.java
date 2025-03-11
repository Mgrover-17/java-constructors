public class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee=0.0;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    public static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
    }

    public static void main(String[] args) {
        Vehicle obj=new Vehicle("Janvi", "Car");
        System.out.println("Vehicle Details Before Updating Fee:");
        obj.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1000.0);

        System.out.println("Vehicle Details After Updating Fee:");
        obj.displayVehicleDetails();
    }
}
