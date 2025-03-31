package package1;

import java.util.ArrayList;
import java.util.List;



public class bus {
    static List<create_bus> buses=new ArrayList<>();
    public bus(int count){                  // count was the 1st input only to initialize
        for(int i=1; i<=count; i++){
            buses.add(new create_bus(i));
        }
    }

    // class start
    public static class create_bus{
        int busNo;
        int capacity=2;
        int AC=1;
        int non_AC=1;

        public create_bus(int c) {
            this.busNo = c;
        }
    }

    // class  ends

    public create_bus check_booking_avail(int choice){
        for(create_bus bus:buses){
            if(choice==1 && bus.AC>0) {
                return bus;
            }
            if(choice==2 && bus.non_AC>0) {
                return bus;
            }
        }
        if(choice==1)
            System.out.println("AC is not available plz check Non-AC is Available");
        else
            System.out.println("Non-AC is not available plz check AC is Available");
        return null;
    }

    public void cancel_ticket(int ID, int choice){
        for(create_bus bus:buses){
            if(bus.busNo==ID){
                bus.capacity++;
                if(choice==1)
                    bus.AC--;
                else
                    bus.non_AC--;
                return;
            }
        }
    }


}
