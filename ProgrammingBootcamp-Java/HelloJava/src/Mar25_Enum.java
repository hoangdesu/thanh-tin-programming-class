import java.util.Scanner;

public class Mar25_Enum {
    public static void main(String[] args) {
        // enum

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Traffic light: ");
//        String trafficLight = sc.nextLine();
//
//        if (trafficLight.equals("green")) {
//            System.out.println("Go");
//        } else if (trafficLight.equals("yellow")) {
//            System.out.println("Slow down");
//        } else if (trafficLight.equals("red")) {
//            System.out.println("Stop");
//        }

        enum TrafficLight {
            GREEN,  // 0
            YELLOW, // 1
            RED     // 2
        }

        TrafficLight light = TrafficLight.GREEN;

        light = TrafficLight.YELLOW;
        light = TrafficLight.RED;

        System.out.println(light);
    }
}
