package Challenge3.Task4;

public class GameTest {

    public static void main(String[] args) {
        /**
         * Sample code has been provided as as starting point to test your
         * implementation.
         *
         * IMPORTANT: This code will not compile until you write the classes being
         * instantiated here.
         * You may modify this code for faster testing purposes and exploration, but
         * your assessment is through the use of unit tests, so you need to ensure that the
         * classes you write comply with the requirements setout in the documentation.
         *
         * Adding undocumented public methods to your Team, Panda, Supporter, and Combatant classes
         * may mean that the unit tests fail as our testing code will be unaware of your new
         * methods and therefore cannot call those methods.
         */

        // UNCOMMENT THE CODE BELOW ONCE YOU HAVE WRITTEN YOUR CODE TO TEST YOUR
        // IMPLEMENTATION
        Team team1 = new Team(GameConfig.TEAM_NUM1, GameConfig.TEAM1_X_HOME_POINT, GameConfig.TEAM1_Y_HOME_POINT);
        Team team2 = new Team(GameConfig.TEAM_NUM2, GameConfig.TEAM2_X_HOME_POINT, GameConfig.TEAM2_Y_HOME_POINT);

        //  // Add 2 Combatants and 2 Supporters to each team
        for (int i = 1; i <= 2; i++) {
            Panda pandaCombatantTeam1 =
                    new Combatant(i,
                            String.format("Team%d_Panda%d",
                                    GameConfig.TEAM_NUM1,
                                    i),
                            team1);

            Panda pandaCombatantTeam2 =
                    new Combatant(i + 4,
                            String.format("Team%d_Panda%d",
                                    GameConfig.TEAM_NUM2,
                                    i + 4),
                            team2);
        }

//        System.out.println(team1.getMemberList());
//        System.out.println(team2.getMemberList());


          for (int i = 3; i <= 4; i++) {
               Panda pandaSupporterTeam1 =
                   new Supporter(i,
                                 String.format("Team%dPanda%d",
                                              GameConfig.TEAM_NUM1,
                                              i),
                                  team1);

               Panda pandaSupporterTeam2 =
                   new Supporter(i + 4,
                                 String.format("Team%dPanda%d",
                                              GameConfig.TEAM_NUM2,
                                              i + 4),
                                 team2);
          }

        //  // Display the formation of every team

          System.out.println("Team 1 members: ");
          System.out.println(team1.getMemberList());

          System.out.println("Team 2 members: ");
          System.out.println(team2.getMemberList());

        //  // Test the teleportHome() method

        //  Panda panda1 = team1.getMemberList().get(0);
        //  panda1.setCoordinate(30, 30);

        //  System.out.printf("Panda1 Coordinates (%d, %d)\n",
        //                    panda1.getXCoord(), panda1.getYCoord());

        //  panda1.teleportHome();

        //  String pandaCoordAfterTeleport = String.format("(%d,%d)",
        //                                                 panda1.getXCoord(),
        //                                                 panda1.getYCoord()
        //                                     );

        //  String teamHomeCoord = String.format("(%d,%d)",
        //                                       panda1.getTeam().getXCoordHome(),
        //                                       panda1.getTeam().getYCoordHome()
        //                          );

        //  System.out.printf("Panda1 Coordinates after teleporting (%d, %d)\n",
        //                    panda1.getXCoord(), panda1.getYCoord());

        //  System.out.println("Teleport Successful? " +
        //                     pandaCoordAfterTeleport.equals(teamHomeCoord));

        //  System.out.println("-----------------------------------");
        //  // Test the pull() method

        //  Panda panda2 = team2.getMemberList().get(0);
        //  panda1.setCoordinate(30, 32);
        //  panda2.setCoordinate(30, 35);
        //  double distance = panda1.computeDistanceToOtherPanda(panda2);

        //  System.out.printf("Panda1 Coordinates before pulling (%d, %d)\n",
        //                    panda1.getXCoord(), panda1.getYCoord());

        //  System.out.printf("Panda2 Coordinates before pulling (%d, %d)\n",
        //                    panda2.getXCoord(), panda2.getYCoord());

        //  ((Combatant) panda1).pull(panda2);

        //  System.out.printf("Panda2 is %.2f meters away from Panda1\n" +
        //                    "After pulling, Panda2 is at (%d, %d).\n",
        //                     distance, panda2.getXCoord(), panda2.getYCoord());

        //  System.out.println("-----------------------------------");

        //  // Test the healGroup() method
        //  Supporter supporter = (Supporter) team1.getMemberList().get(2);

        //  Panda friendPanda2 = team1.getMemberList().get(1);

        //  Panda opponentPanda1 = team2.getMemberList().get(0);

        //  // Set the health point tests for 3 friend pandas and 1 opponent panda
        //  int[] healthPointTestValues = {50, 70, 90, 87};

        //  friendPanda2.setCoordinate(30, 33);
        //  friendPanda2.setHealthPoint(healthPointTestValues[0]);

        //  supporter.setCoordinate(31, 31);
        //  supporter.setHealthPoint(healthPointTestValues[1]);
        //  int supporterHealthPointBeforeHealing = supporter.getHealthPoint();

        //  panda1.setCoordinate(30, 30);
        //  panda1.setHealthPoint(healthPointTestValues[2]);

        //  opponentPanda1.setCoordinate(31, 33);
        //  opponentPanda1.setHealthPoint(healthPointTestValues[3]);
        //  int opponentHealthPointBeforeHealing = opponentPanda1.getHealthPoint();

        //  System.out.println("Before calling the heal group:");

        //  System.out.println("Team 1 members: ");
        //  System.out.println(team1.getMemberList());

        //  System.out.println("Team 2 members: ");
        //  System.out.println(team2.getMemberList());

        //  System.out.println();

        //  supporter.healGroup();

        //  System.out.println("After calling the heal group:");

        //  System.out.println("Team 1 members: ");
        //  System.out.println(team1.getMemberList());

        //  System.out.println("Team 2 members: ");
        //  System.out.println(team2.getMemberList());

        //  System.out.println();

        //  // Check if the panda health points are updated correctly
        //  // If healing power is greater than the health point, the health point should be 100

        //  System.out.println("friendPanda2 is healed? " +
        //                       (friendPanda2.getHealthPoint() == ( healthPointTestValues[0] + supporter.getHealingPower() > 100
        //                       ? 100
        //                       : healthPointTestValues[0] + supporter.getHealingPower() )
        //                       ));
        //  System.out.println("supporter is not healed? " +
        //                       (supporter.getHealthPoint() == supporterHealthPointBeforeHealing)
        //                       );
        //  System.out.println("panda1 is healed? " +
        //                       (panda1.getHealthPoint() == ( healthPointTestValues[2] + supporter.getHealingPower() > 100
        //                        ? 100
        //                       : healthPointTestValues[2] + supporter.getHealingPower() )
        //                       ) );

        //  System.out.println("opponentPanda1 is not healed? " + (opponentPanda1.getHealthPoint() == opponentHealthPointBeforeHealing));

    }
}