package lesson101.generics.part4;

import java.util.ArrayList;
import java.util.List;

public class FootballTeam {
  private String teamName;
  private List<Player> teamMembers = new ArrayList<>();
  private int totalWins = 0;
  private int totalLosses = 0;
  private int totalTies = 0;

  public FootballTeam(String teamName) {
    this.teamName = teamName;
  }

  public void addPlayer(Player player) {
    if (!teamMembers.contains(player)) {
      teamMembers.add(player);
    }
  }

  public void listTeamMembers() {
    System.out.println(teamName + " Roster:");
    teamMembers.forEach(System.out::println);
  }

  public int ranking() {
    return (totalLosses * 2) + totalTies + 1;
  }

  public String setScore(int ourScore, int theirScore) {
    String message = "lost to";
    if (ourScore > theirScore) {
      totalWins++;
      message = "beat";
    } else if (ourScore == theirScore) {
      totalTies++;
      message = "tied";
    } else {
      totalLosses++;
    }
    return message;
  }

  @Override
  public String toString() {
    return teamName + " (Ranked " + ranking() + ")";
  }

}
