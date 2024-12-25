package lesson101.generics.part2;

public class Main {

  public static void main(String[] args) {
    FootballTeam barcelona = new FootballTeam("Barcelona");
    FootballTeam realMadrid = new FootballTeam("Real Madrid");
    scoreResult(barcelona, 4, realMadrid, 0);

    var yamal = new FootballPlayer("Lamine Yamal", "Left Forward");
    var lewandowski = new FootballPlayer("Robert Lewandowski", "Right Forward");
    barcelona.addPlayer(yamal);
    barcelona.addPlayer(lewandowski);
    barcelona.listTeamMembers();

    SportsTeam barcelona1 = new SportsTeam("Barcelona B");
    SportsTeam realMadrid1 = new SportsTeam("Real Madrid B");
    scoreResult(barcelona1, 4, realMadrid1, 0);

    BaseballPlayer baseballPlayer = new BaseballPlayer("Lamine Yamal", "Left Forward");
    barcelona1.addPlayer(baseballPlayer);
    barcelona1.addPlayer(yamal);
    barcelona1.listTeamMembers();

  }

  public static void scoreResult(FootballTeam team1, int t1Score,
                                 FootballTeam team2, int t2Score) {
    String message = team1.setScore(t1Score, t2Score);
    team2.setScore(t2Score, t1Score);
    System.out.printf("%s %s %s %n", team1, message, team2);
  }

  public static void scoreResult(SportsTeam team1, int t1Score,
                                 SportsTeam team2, int t2Score) {
    String message = team1.setScore(t1Score, t2Score);
    team2.setScore(t2Score, t1Score);
    System.out.printf("%s %s %s %n", team1, message, team2);
  }

}
