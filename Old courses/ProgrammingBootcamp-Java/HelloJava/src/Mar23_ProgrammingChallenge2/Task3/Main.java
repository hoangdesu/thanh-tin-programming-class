package Mar23_ProgrammingChallenge2.Task3;

public class Main {
    public static void main(String[] args){
        /**
         * Sample code has been provided as as starting point to test your implementation.
         *
         * IMPORTANT: This code will not compile until you write the classes and enum being used here.
         * You must write the class with the documented method signatures before you can use the test code
         * below.
         * You may modify this code for faster testing purposes and exploration, but your assessment is
         * evaluated through the use of unit tests, so you need to ensure that the classes/enum you write
         * comply with the requirements setout in the documentation.
         *
         * Adding undocumented methods to your classes will mean that
         * the unit tests may fail.
         */

        // UNCOMMENT THE CODE BELOW ONCE YOU HAVE WRITTEN YOUR CODE TO TEST YOUR IMPLEMENTATION
        TheatreShow onlyFools = new TheatreShow("Only Fools And Horses", "Tom Bennett", 133);
        TheatreShow moulin = new TheatreShow("Moulin Rouge", "Ewan Mcgreggor", 143);
        System.out.println("Theatre Show Name: " + onlyFools.getName());
        System.out.println("Actor Name: " + moulin.getLeadActor());
        System.out.println("toString: " + onlyFools);
        System.out.println("toString: " + moulin);

        // Additional objects for testing.
        String ERROR = "ERROR";

        String NAME_EMPTY = "";
        String NAME_NULL = null;

        String OnlyFoolsAndHorses = "Only Fools and Horses";
        String onlyfoolsandhorses = "only fools and horses";
        String ONLY_FOOLS_AND_HORSES = "ONLY FOOLS AND HORSES";
        String TOM_BENNETT = "Tom Bennett";
        int RUNNING_TIME_133 = 133;

        String MoulinRouge = "Moulin Rouge";
        String moulinrouge = "moulin rouge";
        String MOULIN_ROUGE = "MOULIN ROUGE";
        String EWAN_MCGREGGOR = "Ewan McGreggor";
        int RUNNING_TIME_143 = 143;

        String THE_LION_KING = "the lion king";
        String GUYS_AND_DOLLS = "guys and dolls";
        String DIRTY_DANCING = "dirty dancing";
        String WICKED = "wicked";
        String LES_MISERABLE = "les miserable";
        String JULIET = "juliet";
        String FROZEN = "frozen";
        String MAMMA_MIA = "mamma mia";
        String SHETLAND = "shetland";

        String LEADING_SPACE = "  " + ONLY_FOOLS_AND_HORSES;
        String TRAILING_SPACE = MOULIN_ROUGE + "  ";

        String BRANDON_MCCALL = "Brandon McCall";
        String PATRICK_SWAYZE = "Patrick Swayze";
        String LUCY_JONES = "Lucy Jones";
        String MIRIAM_LEE = "Miriam Lee";
        String SAMANTHA_BARKS = "Samantha Barks";

        String EMMA_MULLEN = "Emma Mullen";

        TheatreShow THE_LION_KING_THEATRE = new TheatreShow(THE_LION_KING, BRANDON_MCCALL, 99);
        TheatreShow GUYS_AND_DOLLS_THEATRE = new TheatreShow(GUYS_AND_DOLLS, EWAN_MCGREGGOR, 116);
        TheatreShow DIRTY_DANCING_THEATRE = new TheatreShow(DIRTY_DANCING, PATRICK_SWAYZE, 142);
        TheatreShow WICKED_THEATRE = new TheatreShow(WICKED, LUCY_JONES, 139);
        TheatreShow LES_MISERABLE_THEATRE = new TheatreShow(LES_MISERABLE, LUCY_JONES, 141);
        TheatreShow JULIET_THEATRE = new TheatreShow(JULIET, MIRIAM_LEE, 121);
        TheatreShow FROZEN_THEATRE = new TheatreShow(FROZEN, SAMANTHA_BARKS, 100);
        TheatreShow MAMMA_MIA_THEATRE = new TheatreShow(MAMMA_MIA, EMMA_MULLEN, 119);
        TheatreShow SHETLAND_THEATRE = new TheatreShow(SHETLAND, EMMA_MULLEN, 109);
    }
}
