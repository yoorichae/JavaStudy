import java.util.Scanner;

public class Bear extends GameObject {
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	@Override
	public void move() {
		Scanner scanner = new Scanner(System.in);
		
		char move;		
		move=scanner.next().charAt(0);
		
		if (move == 'a') { //왼쪽
			if(y<=0)	
				y=0;
			else	
				y=y-distance;
		}
		else if (move == 'd') {	//오른쪽
			if(y>=19)	
				y=19;
			else	
				y=y+distance;
		}
		else if (move == 'w') {	//위
			if(x<=0)	
				x=0;
			else	
				x=x-distance;
		}
		else if (move == 's') {	//아래
			if (x>=9)	
				x=9;
			else		
				x=x+distance;
		}
	}
	
	@Override
	public char getShape() {
		return 'B';
	}
}
