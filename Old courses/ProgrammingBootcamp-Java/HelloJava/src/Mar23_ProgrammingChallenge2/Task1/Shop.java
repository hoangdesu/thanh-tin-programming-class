package Mar23_ProgrammingChallenge2.Task1;

public class Shop {

    private Garment[] list;

    public Shop() {
        initialise();
    }

    private void initialise(){
        list = new Garment[5];
        Garment gazmanBusiness = new Garment("Gazman Business Shirt", "Blue", 42);
        Garment roddGunnPolo = new Garment("Rodd & Gunn Polo", "Chocolate", 38);
        Garment wranglerCargo = new Garment("Wrangler Cargo", "Teal", 32);
        Garment properChinos = new Garment("Propercloth Chinos", "Stone", 32);
        list[0] = gazmanBusiness;
        list[1] = roddGunnPolo;
        list[2] = wranglerCargo;
        list[3] = properChinos;
    }

    public int getIndexOfEmptySpot(){
        int index = -1;
        for(int i = 0; i < list.length; i++){
            if(list[i] == null){
                index = i;
            }
        }
        return index;
    }

    public void add(Garment garment){
        int index = getIndexOfEmptySpot();
        if(index >=0 && index < list.length){
            list[index] = garment;
        }
    }

    public void printAllItems() {
        for (int i = 0; i < list.length; i++) {
            if(list[i] != null){
                System.out.println(list[i]);
            }
        }
    }
}
