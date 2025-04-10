package Lab.Lab8_4;

public class Suburb_NotGood {
    // properties: thuộc tính
    String name;

    // constructor
    public Suburb_NotGood(String name) {
//        this.name = name; -> ko dc phep gan truc tiep. Phai kiem tra dieu kien truoc khi gan

//        1. name: 1 <= length <= 26 && title case
        if (1 <= name.length() && name.length() <= 26) {
            String[] wordsArray = name.split(" ");
            boolean isTitleCase = true;
            for (String word : wordsArray) {
//                kiem tra ki tu dau tien co nam trong khoang 65-90 (ASCII uppercase) hay ko
                if (!(word.charAt(0) >= 65 && word.charAt(0) <= 90)) {
                    isTitleCase = false;
                    break;
                }
            }

            // den bay gio moi gan gia tri, khi name da thoa 2 dieu kien ve do dai va title case
            if (isTitleCase) {
                this.name = name;
            } else {
                this.name = "ERROR";
            }

        } else {
            this.name = "ERROR";
        }

    }

}
