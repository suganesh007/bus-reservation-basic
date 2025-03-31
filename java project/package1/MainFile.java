// to increase bus length and seats can update
// bus.java.createBus increase
// ac seats and non ac seats numbers

// in main change new bus(values should change to
// increase the bus length);

package package1;

import java.util.Scanner;

public class MainFile{
    public static void main(String[] args){
        bus bus=new bus(2);
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("""
                    1.) Book Ticket\s
                    2.) view ticket\s
                    3.) ticket cancellation \s
                    4.) exit""");

            int input=sc.nextInt();
            switch (input){
                case 1:{
                    // bookings
                    System.out.println("1.) AC \s2.) Non-AC");
                    int input2=sc.nextInt();

                    // checking booking availability
                    package1.bus.create_bus booking_bus =bus.check_booking_avail(input2);
                    if(booking_bus!=null) {
                        System.out.println("Bus is Available to Book");
                    }
                    else {
                        break;
                    }

                    // booking ticket init
                    booking.book_init(booking_bus, input2);
                    break;
                }
                case 2:{
                    passenger.print_ticket();
                    break;
                }
                case 3:{
                    System.out.println("Enter Name: ");
                    Scanner scanner=new Scanner(System.in);
                    String str= scanner.nextLine();
                    int id=passenger.getId(str);
                    int seat=passenger.getSeat(str);
                    bus.cancel_ticket(id, seat);
                    passenger.cancel_ticket(str);
                    break;
                }
                case 4:{
                    flag=false;
                    break;
                }
            }

        }
    }
}