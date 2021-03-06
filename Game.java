

public class Game {

	int turnCounter;
	final String p1PieceColor = "black";
	final String p2PieceColor = "red";
	int p1Score = 0;
	int p2Score = 0;

	//buffered reader input stream 
	//take in names of players

	public Game()
	{
		
	}
	
	public int getTurnCounter(){
		return turnCounter;
	}	

	private boolean is_inbounds(int a, int b, int x, int y) {

		return ((a >= 0 && a <= 9) && 
				(b >= 0 && b <= 9) && 
				(x >= 0 && x <= 9) && 
				(y >= 0 && y <= 9));	
	}

	private boolean dark_square(int a, int b, int x, int y) {
		//Checking for dark square ONLY.
		//Dark squares have an even/odd OR odd/even combination
		return ( ((a % 2 == 0 && b % 2 == 1) || (a % 2 == 1 && b % 2 == 0)) && 
				 ((x % 2 == 0 && y % 2 == 1) || (x % 2 == 1 && y % 2 == 0)) );	
	}

	private boolean singleJump(Piece p, int a, int b, int x, int y) {
		//need orientation based on color
		return false;
	}

	protected boolean isMoveValid(Piece p, int a, int b, int x, int y) {

		//----inbounds
		//not on a square that's occupied
		//not more that one jump
		//----dark squares only
		//check source square and destination sq

		String color = p.getColor();
		
		switch ( color ) {

			case "BLK": // SOUTHBOUND

				System.out.println("SOUTHBOUND");

				break;

			case "RED": // NORTHBOUND

				System.out.println("NORTHBOUND");

				break;	
		}	
					
		return false;
	}
	
	private void GameLoop()
	{
		/*
		Board b; //instance to keep track of piece
		while(p1Score < 20 || p2Score < 20)
		{
				
		}
		*/
	}	
	
	public static void main(String [] args){
		Piece p1 = new Piece("BLK",false,'-');
		Piece p2 = new Piece("RED",false,'-');
		Piece p3 = new Piece("BLK",false,'-');
		Piece p4 = new Piece("BLK",false,'-');
		Piece p5 = new Piece("RED",false,'-');


		Game g = new Game();
		g.isMoveValid(p1,0,0,1,1);
		g.isMoveValid(p2,0,0,1,1);
		g.isMoveValid(p3,0,0,1,1);
		g.isMoveValid(p4,0,0,1,1);
		g.isMoveValid(p5,0,0,1,1);
		
		System.out.println(g.is_inbounds(0,0,1,1));
		System.out.println(g.is_inbounds(9,9,9,9));
		System.out.println(g.is_inbounds(10,0,1,1));
		System.out.println(g.is_inbounds(0,10,1,1));
		System.out.println(g.is_inbounds(0,0,19,1));
		System.out.println(g.is_inbounds(0,0,1,11));

		
		System.out.println("dark: " + g.dark_square(0,1,0,1));
		System.out.println("dark: " + g.dark_square(1,0,1,0));
		System.out.println("dark: " + g.dark_square(0,1,1,0));
		System.out.println("dark: " + g.dark_square(1,0,0,1));

	}
}
