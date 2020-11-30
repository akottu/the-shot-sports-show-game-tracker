import host.Host;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static List<Host> hosts = new ArrayList<>();

  public static void main(String [] args) {
    addAllHosts();

    printScoreboard(hosts);
  }

  private static void addAllHosts() {
    addHost("Anish Kottu");
    addHost("Jay Chandar");
    addHost("Alex Frumkin");
    addHost("Ram Gollapudy");
    addHost("Alan Zhao");
    addHost("Ryan Lee");
    addHost("Drew Gagliano");
    Collections.shuffle(hosts);
  }

  private static void addHost(String fullName) {
    hosts.add(new Host(fullName));
  }

  private static void printScoreboard(List<Host> hosts) {
    System.out.println();
    System.out.println(String.format("%11s%9s%11s", "           ", "FOOTBALL.", "           "));
    System.out.println(String.format("%-4s%3s%-15s%3s%6s", "Rank", "   ", "Name", "   ", "Points"));
    for(int i = 0; i < hosts.size(); i++) {
      System.out.println(String.format("%4d%3s%-15s%3s%6d", i + 1, "   ",
          hosts.get(i).getFullName(), "   ", hosts.get(i).getPoints()));
    }
  }

}
