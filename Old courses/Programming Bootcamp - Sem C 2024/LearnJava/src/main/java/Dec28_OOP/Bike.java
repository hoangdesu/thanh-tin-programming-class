package Dec28_OOP;

public class Bike extends Vehicle {
//    tái định nghĩa lại hàm trong class con

//    @Override: annotation (optional): ko cần thiết, nhưng nên thêm vào để rõ ràng code
    @Override
    public void drive() {
        System.out.println("Ủn ủn");
    }

//    Thay đổi class con, ko ảnh hưởng đến class cha
//    Nhưng thay đổi class cha, ảnh hưởng đến tất cả class con
    public void race() {
        System.out.println("Bike running at 200km/h");
    }
}
