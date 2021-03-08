

public class Player implements Moveable {

	Game g;
	String name;
	int score;
	boolean turn;
	String color;
	
	public Player(String name, int score)
	{
		this.name = name;
		this.score = score;	
	}	

	public String getName(){
		return name;
	}

	private void setName(String name){
		this.name = name;
	}

	public int getScore(){
		return score;
	}

	public String getPieceColor(){
		return color;
	}
	
	public void move(int a, int b, int x, int y){

	}
	
}
