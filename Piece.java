

public class Piece implements Moveable{

	private String color;	
	private boolean isKing;
	private char c;
	Board b;
	
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

	public void move(int a, int b, int x, int y){
		//nothing complicated.  just move the piece
	}

}
