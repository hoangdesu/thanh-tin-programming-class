public class Jan14_Methods {
    public static void main(String[] args) {
//        System.out.println("cai nay o trong main");

//        System.out.println("Monday:");
//        prepareForSchool(); // method calls
//
//        System.out.println("Tuesday:");
//        prepareForSchool();
//
//        System.out.println("Wednesday:");
//        prepareForSchool();
//
//        System.out.println("Thursday:");
//        prepareForSchool();

//        sayHello("Tin");
//        sayHello("Hoang :D");

        introduce("Tin", 19, "IT");
        introduce("Hoang", 28, "Computer Science");
    }

//    Method definition
    // no input - no output
    public static void prepareForSchool() {
        System.out.println("- wake up");
        System.out.println("- prepare");
        System.out.println("- have breakfast");
        System.out.println("- get dressed");
        System.out.println("- go to school");
        System.out.println("----------------\n");
    }

//    1 input, no output
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

//    multiple inputs, no output
//    the order of the inputs matters
    public static void introduce(String name, int age, String major) {
        System.out.println("Hi everyone, my name is " + name + ". I am " + age + " years old and I study " + major);
//        return value;
    }

//    public void hi() {
//        System.out.println("Hello methods!!!");
//    }

}

//functions: hàm
// reusable block of code that does something
//
//vd:
//
//di hoc:
//    - thuc day
//    - danh rang rua mat
//    - an sang
//    - thay do
//    - lay xe di hoc
//
//function trong class => method

//2 steps when working with methods:
//    1. method definition: định nghĩa hàm
//    2. method call: gọi hàm (invoke, run, execute)

//Methods might have inputs and/or outputs

// TODO: arguments, parameters, return keyword (output)