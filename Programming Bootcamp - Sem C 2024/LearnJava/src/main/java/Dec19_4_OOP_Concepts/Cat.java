package Dec19_4_OOP_Concepts;

public class Cat {
    // 1. Encapsulation: tính đóng gói
    private String name;
    private String breed; // giống loài

    // constructor
    Cat(String breed) {
        this.breed = breed;
    }


//    Cat(String name) {
//        this.name = name;
//    }

//    Thông qua 2 hàm: getter vs setter
//    getter: getName() -> name
//    setter: setName(String name) -> gán lại giá trị cho name
//    NOTE: getter and setter must be public

//    getter
    public String getName() {
        return this.name;
    }

//    setter
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

//    hàm đặc biệt:
//    - nếu class ko có hàm toString, mặc định là in memory address của object
//    - nếu class CÓ hàm toString, thì khi in object, hàm toString mặc định sẽ dc gọi
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
