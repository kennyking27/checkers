
/*
 *	2/26/21
 */

public class Board {

private	final int HEIGHT = 10;
private final int WIDTH = 10;
private final char P1 = 'a'; 
private final char P2 = 'b'; 

protected char [][] GameBoard = new char[HEIGHT][WIDTH];

	public Board()
	{
		this.createGameBoard();		
	}
	
	public int HEIGHT(){ return HEIGHT; }
	
	public int WIDTH(){ return WIDTH; }

	private void setPiece(int x, int y, char c){ this.GameBoard[x][y] = c; }

	public char getPiece(int x, int y){ return this.GameBoard[x][y]; }

	protected void createGameBoard(){
		
		for(int i = 0; i < HEIGHT; i++){
			for(int j = 0; j < WIDTH; j++){
				Piece p;	
				if(i <= 3) 
				{ // even or odd || odd or evem
					if(((i % 2 == 0) && (j % 2 == 1)) || ((i % 2 == 1) && (j % 2 == 0))){
						p = new Piece("RED",false,P1);
						this.setPiece(i,j,p.getCharFromPiece());					
					}
					else{
						this.setPiece(i,j,' ');
					}
				}

				//must account for the middle two rows.  set them to null char
				if(i >= 4 && i <= 6)
				{
					if(((i % 2 == 0) && (j % 2 == 1)) || ((i % 2 == 1) && (j % 2 == 0))){
						this.setPiece(i,j,'-');
					}
					else{
						this.setPiece(i,j,' ');
					}
				}

				if(i >= 6)
				{ // even or odd || odd or evem
					if(((i % 2 == 0) && (j % 2 == 1)) || ((i % 2 == 1) && (j % 2 == 0))){
						p = new Piece("BLK",false,P2);
						this.setPiece(i,j,p.getCharFromPiece());					
					}
					else{
						this.setPiece(i,j,' ');
					}
				}
			}
		}
	}

	public void printGameBoard(){

		for(int i = 0; i < HEIGHT; i++){
			for(int j = 0; j < WIDTH; j++){
				System.out.print(this.getPiece(i,j));
			}
			System.out.println();
		}		
	}

	
	public static void main(String [] args){
		Board b = new Board();
		Game g = new Game();
		Piece p = new Piece("RED", false, '=');
		
		b.printGameBoard();
		
	}
}
