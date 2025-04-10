import java.util.HashMap;

public class Feb20_HashMap {
    public static void main(String[] args) {
        System.out.println(getCharFrequency("abca"));
        System.out.println(getCharFrequency("aksjaasdasdasdacacacxzzxczxc"));

//        System.out.println(getMostAppearedCharacter("abca")); // a
//        System.out.println(getMostAppearedCharacter("ccacvytcacccjckcclc")); // c


//        ->
//        {
//            a: 2,
//            b: 1,
//            c: 1
//        }
//
//        i
//        0123
//        abca
//      ^
//        {
//           // empty hashmap
//        }
//
//
//        0123
//        abca
//        ^
//        chua co key a, tao key=a, va frequency=1
//        {
//            a: 1
//        }
//
//        0123
//        abca
//          ^
////                chua co key a, tao key=a, va frequency=1
//        {
//            a: 1,
//            b: 1,
//            c: 1
//        }
//
//        0123
//        abca
//           ^
////                da co key a, lay so dem hien tai va update +1
//        {
//            a: 2,
//            b: 1,
//            c: 1
//        }
    }

    public static HashMap<Character, Integer> getCharFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i); // each character at index i
//            System.out.println(currentChar);

//            sử dụng currentChar làm key cho map

//            neu map chua co key do
            if (!map.containsKey(currentChar)) {
                map.put(currentChar, 1); // tạo 1 cặp giá trị trong map vd: {a=1};
            } else {
                // neu da co key roi, update count hien tai len +1
                int currentCount = map.get(currentChar);
                int newCount = currentCount + 1; // update count len 1 so
                map.put(currentChar, newCount);
            }
        }

        return map;
    }

//    public static char getMostAppearedCharacter(String s) {
//        map = getCharFrequency(s);
//
////        tìm kí tự với số lần xuất hiện nhiều nhất
//
////        hint: tìm số lớn nhất bên tay phải (cột values), return key tương ứng
//
////        return kí tự đó
//    }
}
