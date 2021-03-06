

public class Piece {

	private String color;	
	private boolean isKing;
	private char c;

	
	public Piece(String color, boolean isKing, char c)
	{
		this.color = color;
		this.isKing = isKing;	
		this.c = c;	
	}

	public char getCharFromPiece(){
		return c;
	}	

	public String getColor(){
		return color;
	}

	public boolean getKingStatus(){
		return isKing;
	}
}
