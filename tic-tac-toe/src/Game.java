import board.Board;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import player.Player;
import playingpieces.PiecesType;

public class Game {
  public static void main() {
    Player player1 = new Player("Tom", PiecesType.X);
    Player player2 = new Player("Bot", PiecesType.Y);
    List<Player> playersList = Arrays.asList(player1, player2);
    Board board = new Board(3, playersList);

    int count = 0;
    while (true) {
      System.out.println("Player #" + (count+1) + " turn...");
      System.out.println("Enter location to put piece: ");

      Scanner scanner = new Scanner(System.in);
      Integer a = scanner.nextInt();
      Integer b = scanner.nextInt();

      if (board.isLocationFree(a, b)) {
        board.markLocation(a, b, playersList.get(count));
      } else {
        System.out.println("invalid location!");
      }

      board.traverseBoard();

      if (count == 0) {
        count = 1;
      } else {
        count = 0;
      }
    }
  }
}
