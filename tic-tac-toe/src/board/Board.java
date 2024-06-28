package board;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import player.Player;
import playingpieces.PiecesType;

public class Board {
  Integer boardSize;
  PiecesType[][] board;

  Map<String, int[]> rows;
  Map<String, int[]> cols;
  Map<String, Integer> diagonal;
  Map<String, Integer> antiDiagonal;

  public Board(Integer size, Map<String, int[]> rows, Map<String, int[]> cols, Map<String, Integer> diagonal, Map<String, Integer> antiDiagonal){
    this.boardSize = size;
    this.board = new PiecesType[this.boardSize][this.boardSize];
    this.rows = rows;
    this.cols = cols;
    this.diagonal = diagonal;
    this.antiDiagonal = antiDiagonal;
  }

  public void traverseBoard(){
    for (int i = 0; i < boardSize; i++){
      for (int j = 0; j < boardSize; j++){
        System.out.println(board[i][j]);
      }
    }
  }

  public void markLocation(int row, int col, Player player){
    this.board[row][col] = player.getPiecesType();
    this.rows.get(player.getName())[row]++;
    this.cols.get(player.getName())[col]++;

    if (row == col){
      this.diagonal.put(player.getName(), diagonal.getOrDefault(player.getName(), 0)+1);
    }

    if (row + col == this.boardSize - 1){
      this.antiDiagonal.put(player.getName(), antiDiagonal.getOrDefault(player.getName(), 0)+1);
    }

    System.out.println(rows);
    System.out.println(cols);
    System.out.println(diagonal);
    System.out.println(antiDiagonal);
  }

  public boolean checkIsWinner(int row, int col, Player player){
      return rows.get(player.getName())[row] == boardSize || cols.get(player.getName())[col] == boardSize
              || diagonal.get(player.getName()) == boardSize || antiDiagonal.get(player.getName()) == boardSize;
  }

  public boolean isLocationFree(int a, int b){
    return !Objects.nonNull(board[a][b]);
  }
}
