import java.util.Scanner;

public class Apr3_DSA {
    public static void main(String[] args) {
//        DSA: data structures and algorithms

//        Big O notation:
//        - measure efficiency of an algorithm
//        - describe time complexity (độ phức tạp) of an algo
//
//        O(n):
//        - n: input
//
//        ex:
//        fb có 1 tỉ user trong database
//        để tìm 1 user trong datadase sẽ mất 0.01s
//        => để tìm hết 1 tỉ ng dùng, sẽ mất 10tr giây => 166k tiếng => 7k ngày => 20 năm

//        Linear search

        String[] programmingLanguages = { "java", "javascript", "python", "go", "ruby", "typescript" };

        Scanner sc = new Scanner(System.in);
        System.out.print("What programming language do you know: ");
        String searchItem = sc.nextLine();
        boolean found = linearSearch(programmingLanguages, searchItem);

        if (found) {
            System.out.println("You are hired");
        } else {
            System.out.println("Sorry you need to know " + searchItem);
        }
    }

    // time complexity: O(n)
    public static boolean linearSearch(String[] list, String searchItem) {
        boolean found = false;
        for (String lang : list) {
            if (lang.equals(searchItem)) {
                found = true;
                break;
            }
        }
        return found;
    }

//    implement a linear search that returns the index of the item
//    if not found, return -1
}
