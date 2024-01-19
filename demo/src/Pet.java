class Pet {

    public String name;
    public String animal;
    public int age;

    public Pet(String name, int age) {
        this.name = name;
        this.animal = "Unknown animal"; // "Cat" || "Dog"
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Pet Details:");
        System.out.println("\tName: " + this.name);
        System.out.println("\tAge: " + this.age);
        System.out.println("\tAnimal: " + this.animal);
    }
}