package package1;
import java.util.*;
public class passenger {
    // passenger list
    public static ArrayList<p_info> passengers_list=new ArrayList<>();
    p_info details=new p_info();
    public static class p_info {
        private String name;
        private int passenger_busNo;
        private int AC_NonAC;

        public int getAC_NonAC() {
            return AC_NonAC;
        }
        public void setAC_NonAC(int AC_NonAC) {
            this.AC_NonAC = AC_NonAC;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getPassenger_busNo() {
            return passenger_busNo;
        }
        public void setPassenger_busNo(int passenger_busNo) {
            this.passenger_busNo = passenger_busNo;
        }
    }


    public static void print_ticket(){
        boolean flag=true;
        while(flag) {
            System.out.println("1.) Enter the passenger name");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            for (p_info p : passengers_list) {
                if (Objects.equals(str, p.getName())) {
                    System.out.println("Passenger Name: " + p.getName() + "\n" +
                            "Seat Category : " + p.AC_NonAC + "   (1 for AC, 2 for Non-AC)" + "\n"
                            + "Bus_No       : " + p.getPassenger_busNo());
                    return;
                }
            }
            System.out.println("Name not found");
            System.out.println("Do you want to search again? (y(1)/n(2))");
            int choice = sc.nextInt();
            if (choice == 2) {
                flag = false;
            }
        }
    }

    public static void cancel_ticket(String s){
        while(true){
            Scanner sc=new Scanner(System.in);
            for(p_info p:passengers_list){
                if(Objects.equals(p.getName(), s)){
                    passengers_list.remove(p);
                    System.out.println("Name removed");
                    return;
                }
            }
            System.out.println("Name not found");
            int input=sc.nextInt();
            System.out.println("if continue 1 ; to return 2");
            if(input==2){
                return;
            }
        }
    }


    public static int getId(String str) {
        while (true) {
            for (p_info p : passengers_list) {
                if (Objects.equals(p.getName(), str)) {
                    return p.getPassenger_busNo();
                }
            }
            System.out.println("Name not found");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            System.out.println("if continue 1 ; to return 2");
            if (input == 2)
                return 0;
        }
    }


    public static int getSeat(String str) {
        while (true) {
            for (p_info p : passengers_list) {
                if (Objects.equals(p.getName(), str)) {
                    return p.getAC_NonAC();
                }
            }
            System.out.println("Name not found");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            System.out.println("if continue 1 ; to return 2");
            if (input == 2)
                return 0;
        }
    }
}
