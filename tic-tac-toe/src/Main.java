import player.Player;
import playingpieces.PiecesType;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Tom", PiecesType.X);
        Player player2 = new Player("Bot", PiecesType.Y);
        List<Player> playersList = Arrays.asList(player1, player2);
        int boardSize = 3;

        Game game = new Game();
        game.init(boardSize, playersList);
        String winner = game.start();
        System.out.println("Winner Found: " + winner);
    }
}