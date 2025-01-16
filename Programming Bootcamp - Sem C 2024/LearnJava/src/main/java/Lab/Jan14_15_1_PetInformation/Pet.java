package Lab.Jan14_15_1_PetInformation;


public abstract class Pet {

    private String name;
    private int age;

    private final String type;

    Pet(String type, String name, int age) {
        //Write the initialization code.
        this.type = type;

//        Pet Names
        if (name == null || name.length() < 2) {
            this.name = "ERROR";
        } else {
            this.name = name;
        }

//        Pet Age
        if (age >= 0 && age < 100) {
            this.age = age;
        } else {
            this.age = -1;
        }
    }


    public final void printInfo() {
        if (type.equals("Cat") || type.equals("Dog")) {
            System.out.println("Pet Details: ");
            System.out.println("   Name: " + name);
            System.out.println("   Age: " + age);
            System.out.println("   Animal: " + this.type );
        } else {
            System.out.println("Unknown animal");
        }
    }

}

