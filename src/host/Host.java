package host;

public class Host {

  private String fullName;
  private String firstName;
  private String lastName;
  private int points;

  public Host() {
    this.firstName = "Player";
    this.lastName = "X";
    this.fullName = this.firstName + " " + this.lastName;
    points = 0;
  }

  public Host(String fullName) {
    this.fullName = fullName;
    this.firstName = fullName.split(" ")[0];
    this.lastName = fullName.split(" ")[1];
    this.points = 0;
  }

  public Host(String fullName, int startingPoints) {
    this.fullName = fullName;
    this.firstName = fullName.split(" ")[0];
    this.lastName = fullName.split(" ")[1];
    this.points = startingPoints;
  }

  public Host(String firstName, String lastName, int startingPoints) {
    this.fullName = firstName + " " + lastName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.points = startingPoints;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
    this.firstName = fullName.split(" ")[0];
    this.lastName = fullName.split(" ")[1];
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }
}
