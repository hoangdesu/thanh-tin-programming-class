import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Mar13_ArrayList {
    public static void main(String[] args) {
//        ArrayList?
//        .add() -> methods
//        size: dynamic (động)
//
//        array[index]
//        size: static (tĩnh)

        String[] gameArray = {"toc chien"};
        gameArray[0] = "wild rift";
        System.out.println(gameArray[0]);

        // -----
        ArrayList<String> games = new ArrayList<>();
        games.add("pubg"); // 0
        games.add("lien minh"); // 1

        String removedGame = games.remove(0);
        // pop out
        System.out.println("removed game: " + removedGame);

        games.set(0, "league of legends");


        // add at the end of the list
        games.add(0, "audition");
        games.addFirst("overcooked");

//        games.removeLast();


//        games.clear();
//        games.clone
        System.out.println(games.contains("audition"));

        System.out.println("index of game audition: " + games.indexOf("audition"));
        System.out.println("index of game alpha: " + games.indexOf("alpha"));

//        games.forEach();

        System.out.println(games);

        // traditional for
//        for (int i = 0; i < games.size(); i++) {
//            System.out.println(games.get(i));
//        }

        // for rut gon
//        for (String favGame : games) {
//            System.out.println(favGame);
//        }

        // forEach ban cu
        games.forEach(myGame -> {
            System.out.println(myGame);
        });

//        forEach moi
//        games.forEach(System.out::println);

    }
}
