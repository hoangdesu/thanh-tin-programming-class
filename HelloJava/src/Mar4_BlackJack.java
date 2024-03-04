import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Mar4_BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // tao 2 array trong gom 5 phan tu de luu bai
        int maximumCards = 5;
        String[] playerDeck = new String[maximumCards];
        String[] computerDeck = drawComputerDeck();




        // phat bai: 2 la cho player va 2 la cho comp. Also luu vao array

//        System.out.println("Random cards: ");
        System.out.println("Before Player deck: " + Arrays.toString(playerDeck));
        for (int i = 0; i < 2; i++) {
            String randomCard = drawRandomCard();
            System.out.println(randomCard);
            playerDeck[i] = randomCard;
        }

        System.out.println("Player total: " + getTotalDeckValue(playerDeck));

        int indexCounter = 2; // bat dau bang 2 vi da rut truoc 2 la voi index 0 va 1
        for (int i = 0; i < 3; i++) {
            System.out.print("rut hay dan: ");
            String move = sc.nextLine();

            if (move.equals("rut")) {
                String randomCard = drawRandomCard();
                playerDeck[indexCounter] = randomCard;
                indexCounter++;
            } else if (move.equals("dan")) {
                break;
            }

            System.out.println("Player deck: " + Arrays.toString(playerDeck));
            System.out.println("Player total: " + getTotalDeckValue(playerDeck));
        }

        System.out.println("After Player deck: " + Arrays.toString(playerDeck));

        System.out.println("Player total: " + getTotalDeckValue(playerDeck));

        System.out.println("Computer deck: " + Arrays.toString(computerDeck));
        System.out.println("Computer deck value: " + getTotalDeckValue(computerDeck));

        // HW: implement win conditions

    }

    public static String drawRandomCard() {
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int randInt = (int) (Math.random() * cards.length);

        return cards[randInt];
    }

    public static int getTotalDeckValue(String[] deck) {
        int i = 0;
        int total = 0;
        while ((i < deck.length) && deck[i] != null) {
            if (deck[i].equals("J") || deck[i].equals("Q") || deck[i].equals("K")) {
                total += 10;
            } else if (deck[i].equals("A")) {
                total += 11;
            } else {
                total += Integer.parseInt(deck[i]);
            }
            i++;
        }
        return total;
    }

    public static String[] drawComputerDeck() {
        String[] computerDeck = new String[5];
        int i = 0;
        while (getTotalDeckValue(computerDeck) < 20) {
            String randomCard = drawRandomCard();
            computerDeck[i] = randomCard;
            i++;
        }
        return computerDeck;
    }
}

//1. user va computer (nha cai) dc phat 2 la bai
//    -> luu lai bai cua ca 2
//2. display cho user cac la bai va total
//3. cho phep user chon "rut" hoac "dan"
//4. them la bai moi vao bo bai cua user va tinh tong moi
//5. so sanh bai cua user vs bai cua computer


//array of ints
//array of strings

// random 1 so int tu 2-10, 10, 10, 10, 10:
//         JQK -> 10
//         A -> 11
//         xac suat boc trung 1 con bai bat ki (vd: 9): 10%

//Lv1:
//Lv2: bet tien
//- moi player se co $100 de bat dau choi
//- game co nhieu rounds
//- moi round cho phep user bet tien truoc khi choi
//            => cap nhat tien moi cua user
//        +tien neu win
//        -tien neu thua
//- neu user bet het tien -> end game