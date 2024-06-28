package board;

import java.util.List;
import java.util.Objects;
import player.Player;
import playingpieces.PiecesType;

public class Board {
  Integer size;
  List<Player> playerList;
  PiecesType[][] board;

  public Board(Integer size, List<Player> playerList){
    this.size = size;
    this.playerList = playerList;
    this.board = new PiecesType[this.size][this.size];
  }

  public void traverseBoard(){
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        System.out.println(board[i][j]);
      }
    }
  }

  public void markLocation(int a, int b, Player player){
    this.board[a][b] = player.getPiecesType();
  }

  public boolean isLocationFree(int a, int b){
    return Objects.nonNull(board[a][b]) ? false : true;
  }
}
