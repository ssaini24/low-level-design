package player;

import playingpieces.PiecesType;

public class Player {
  String name;
  PiecesType piecesType;

  public Player(String name, PiecesType piecesType){
    this.name = name;
    this.piecesType = piecesType;
  }

  public String getName() {
    return name;
  }

  public PiecesType getPiecesType() {
    return piecesType;
  }
}
