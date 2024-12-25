package lesson101.generics.part1;

public class Main {

  public static void main(String[] args) {
    FootballTeam barcelona = new FootballTeam("Barcelona");
    FootballTeam realMadrid = new FootballTeam("Real Madrid");
    scoreResult(barcelona, 4, realMadrid, 0);

    FootballPlayer yamal = new FootballPlayer("Lamine Yamal", "Left Forward");
    FootballPlayer lewandowski = new FootballPlayer("Robert Lewandowski", "Right Forward");

    barcelona.addPlayer(yamal);
    barcelona.addPlayer(lewandowski);
    barcelona.listTeamMembers();

  }

  public static void scoreResult(FootballTeam team1, int t1Score,
                                 FootballTeam team2, int t2Score) {
    String message = team1.setScore(t1Score, t2Score);
    team2.setScore(t2Score, t1Score);
    System.out.printf("%s %s %s %n", team1, message, team2);
  }

}
