public class Mar11_FormatTable {
    public static void main(String[] args) {
        String[] games = {"Lien Quan", "Toc Chien", "Alpha 8", "Sudoku", "Lien Minh Huyen Thoai", "ABC"};

        formatTable(games);

        /*
        * +---+-----------------------+
        * | # | Games                 |
        * +---+-----------------------+
        * | 1 | Lien Quan             |
        * | 2 | Toc Chien             |
        * | 3 | Alpha 8               |
        * | 4 | Sudoku                |
        * | 5 | Lien Minh Huyen Thoai | --> longest string = str.length() = total length + 2
        * | 6 | ABC                   |
        * +---+-----------------------+
        *
        * */

//        Hint: phai tim dc string co do dai lon nhat -> tu do moi tinh dc chieu ngang cua table

    }

    public static void formatTable(String[] rows) {

        String longestString = "League of Legends";

        System.out.println(longestString.length());

        int maxColumnWidth = longestString.length() + 2; // +1 space dau +1 space sau

//        top
        System.out.print("+");
        for (int i = 0; i < longestString.length() + 2; i++) {
            System.out.print("-");
        }

        System.out.println("+");
        System.out.println("| " + longestString + " |");

//        bottom
        System.out.print("+");
        for (int i = 0; i < longestString.length() + 2; i++) {
            System.out.print("-");
        }

        System.out.println("+");

        String row2 = "Pokemon";
        System.out.print("| " + row2);
        for (int i = 0; i < maxColumnWidth - row2.length() - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
