package Mar28_LabExercisePetCatDog;

public abstract class Pet {

    private String name;
    private int age;

    private final String type;

    Pet(String type, String name, int age){
        //Write the initialization code.

        this.type = type;

        if (name == null || name.length() < 2) {
            this.name = "ERROR";
        } else {
            this.name = name;
        }

        if (age < 0 || age > 100) {
            this.age = -1;
        } else {
            this.age = age;
        }
    }


    public final void printInfo() {
        if (this.type.equals("Cat") || this.type.equals("Dog")) {
            System.out.println("Pet Details: ");
            System.out.println("   Name: " + name);
            System.out.println("   Age: " + age);
            System.out.println("   Animal: " + this.type );
        } else {
            System.out.println("Unknown animal");
        }
    }
}
