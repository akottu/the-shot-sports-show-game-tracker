public class Team {

  private String league;
  private String city;
  private String name;
  private int year;
  private int seasonStanding;
  private int postseasonRound;
  private boolean isWinner;

  public Team(String league, String city, String name, int year) {
    this.league = league;
    this.city = city;
    this.name = name;
    this.year = year;
    this.seasonStanding = 0;
    this.postseasonRound = 0;
    this.isWinner = false;
  }

  public String getLeague() {
    return league;
  }

  public void setLeague(String league) {
    this.league = league;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getSeasonStanding() {
    return seasonStanding;
  }

  public void setSeasonStanding(int seasonStanding) {
    this.seasonStanding = seasonStanding;
  }

  public int getPostseasonRound() {
    return postseasonRound;
  }

  public void setPostseasonRound(int postseasonRound) {
    this.postseasonRound = postseasonRound;
  }

  public boolean isWinner() {
    return isWinner;
  }

  public void setWinner(boolean winner) {
    isWinner = winner;
  }
}
