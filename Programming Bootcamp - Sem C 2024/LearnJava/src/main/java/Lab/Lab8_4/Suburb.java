package Lab.Lab8_4;

public class Suburb {
    String name;

    public Suburb(String name) {
//        1. name
        if (isNameValid(name)) {
            this.name = name;
        } else {
            this.name = "ERROR";
        }


    }

    // helper / utility: hàm nhỏ giúp code dc clean hơn
    boolean isNameValid(String name) {
//        dieu kien 1: length
        if (name.length() < 1 || name.length() > 26) return false;

//        dieu kien 2: title case
        String[] wordsArray = name.split(" ");
        for (String word : wordsArray) {
            if (!(word.charAt(0) >= 65 && word.charAt(0) <= 90)) {
                return false;
            }
        }

        return true;
    }
}
