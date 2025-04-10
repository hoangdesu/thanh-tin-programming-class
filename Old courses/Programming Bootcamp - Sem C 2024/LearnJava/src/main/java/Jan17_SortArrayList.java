import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jan17_SortArrayList {
    static class ProgrammingLanguage {
        private String name;
        private int year;

        public ProgrammingLanguage(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'' +
                    ", year=" + year;
        }
    }

    public static void main(String[] args) {
        ArrayList<ProgrammingLanguage> languages = new ArrayList<>();

        languages.add(new ProgrammingLanguage("python", 1996));
        languages.add(new ProgrammingLanguage("javascript", 1994));
        languages.add(new ProgrammingLanguage("java", 1990));
        languages.add(new ProgrammingLanguage("c", 1985));
        languages.add(new ProgrammingLanguage("lua", 2000));

//        System.out.println(languages);
        for (ProgrammingLanguage lang : languages) {
            System.out.println(lang);
        }
    }

    public static ArrayList<ProgrammingLanguage> sortByYear(ArrayList<ProgrammingLanguage> languages) {
        ArrayList<ProgrammingLanguage> sortedLanguages = (ArrayList<ProgrammingLanguage>) languages.clone();

        // sort by year

        return sortedLanguages;
    }
}
