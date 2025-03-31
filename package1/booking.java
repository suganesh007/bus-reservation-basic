package package1;

import java.util.Scanner;

public class booking {
    static Scanner sc=new Scanner(System.in);
    public static int tickets=0;
    public static void book_init(bus.create_bus bus, int seat_choice){
        System.out.print("\nEnter you name: ");
        String name=sc.nextLine();
        passenger.p_info passenger_creation=new passenger.p_info();
        passenger_creation.setName(name);
        passenger_creation.setAC_NonAC(seat_choice);
        passenger_creation.setPassenger_busNo(bus.busNo);

        // adding passenger details to the passenger list
        passenger.passengers_list.add(passenger_creation);tickets++;
        bus.capacity--;
        if(seat_choice==1){
            bus.AC--;
            System.out.println("\nYou have Successfully booked a seat in AC class.");
        }
        else{
            System.out.println("\nYou have Successfully booked a seat in AC class.");
            bus.non_AC--;
        }

    }
}
