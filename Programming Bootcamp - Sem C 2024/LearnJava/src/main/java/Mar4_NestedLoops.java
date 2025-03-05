public class Mar4_NestedLoops {
    public static void main(String[] args) {
//        for ... {
//            for ... {
//
//            }
//        }



//   #  #
//  ##  ##
// ###  ###
//####  ####


//Left
//   #
//  ##
// ###
//####

//line    #   space
//1       1   3
//2       2   2
//3       3   1
//4       4   0

        int totalLines = 4;
        for (int line = 1; line <= totalLines; line++) {
//            1. printing spaces
            for (int space = totalLines - line; space > 0; space--) {
                System.out.print(" ");
            }

//            2. printing #
            for (int num = 1; num <= line; num++) {
                System.out.print("#");
            }

            System.out.print("  ");
            for (int num = 1; num <= line; num++) {
                System.out.print("#");
            }



            System.out.println();
        }



//Right
// #
// ##
// ###
// ####

//    line    #
//    1       1
//    2       2
//    3       3
//    4       4

    }
}
