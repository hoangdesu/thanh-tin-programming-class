public class Jun5_OOP {
    public static class City {
        String name;

        public City(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        City hcmc = new City("Ho Chi Minh");
        City hanoi = new City("Ha Noi");

        System.out.println(hcmc.name);
        System.out.println(hanoi.name);
    }
}
