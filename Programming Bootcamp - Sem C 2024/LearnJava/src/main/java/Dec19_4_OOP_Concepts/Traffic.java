package Dec19_4_OOP_Concepts;

public class Traffic {
    public static void main(String[] args) {
//        System.out.println(TrafficLight.GREEN);

        TrafficLight traffic = TrafficLight.RED;

        if (traffic == TrafficLight.GREEN) {
            System.out.println("Go");
        } else if (traffic == TrafficLight.YELLOW) {
            System.out.println("Slow down");
        } else {
            System.out.println("Stop");
        }
    }
}
