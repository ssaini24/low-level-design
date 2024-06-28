import board.Board;

import java.util.*;

import player.Player;
import playingpieces.PiecesType;

public class Game {
  Board board;
  Deque<Player> playerDeque;

  Map<String, int[]> rows = new HashMap<>();
  Map<String, int[]> cols = new HashMap<>();
  Map<String, Integer> diagonal = new HashMap<>();
  Map<String, Integer> antiDiagonal = new HashMap<>();

  public void init(int boardSize, List<Player> playerList){
    playerDeque = new LinkedList<>(playerList);

    for (Player player: playerList){
      rows.put(player.getName(), new int[boardSize]);
      cols.put(player.getName(), new int[boardSize]);
      diagonal.put(player.getName(), 0);
      antiDiagonal.put(player.getName(), 0);
    }

    board = new Board(boardSize, rows, cols, diagonal, antiDiagonal);
  }

  public String start() {
    int count = 0;
    while (true) {
      System.out.println("Player #" + (count+1) + " turn...");
      System.out.println("Enter location to put piece: ");

      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (!board.isLocationFree(a, b)) {
        System.out.println("invalid location..try again");
        continue;
      }

      Player player = playerDeque.removeFirst();
      board.markLocation(a, b, player);
      if (board.checkIsWinner(a, b, player)){
        return player.getName();
      }

      board.traverseBoard();
      playerDeque.add(player);
      count = count == 0 ? 1 : 0;
    }
  }
}
