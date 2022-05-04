import java.util.Random;

public class Game {
	char dash = '-';
	static char[][] map = new char [10][20];
	
	public void setmap() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 20; j++) {
				map[i][j] = dash;
			}
		}
	}
	
	public void showmap() {
		for (int i =0; i<10; i++) {		
			for (int j = 0; j<20; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		Game game = new Game();
		
		int bearX = 0, bearY = 0, bearDistance = 1;
		int fishX = new Random().nextInt(10), fishY = new Random().nextInt(20), fishDistance = 1;
		
		Bear bear = new Bear(bearX, bearY, bearDistance);
		Fish fish = new Fish(fishX, fishY, fishDistance);
		
		System.out.println("*****Bear의 Fish먹기 게임을 시작합니다.*****");
		
		while(true) {
			game.setmap();
			
			map[bear.getX()][bear.getY()] = bear.getShape();
			map[fish.getX()][fish.getY()] = fish.getShape();
			
			game.showmap();
			
			System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
			
			bear.move();
			
			System.out.println();
			
			if (bear.collide(fish)) {
				game.setmap();
				
				map[bear.getX()][bear.getY()] = bear.getShape();
				
				game.showmap();
				
				System.out.println("Bear Wins!");
				break;
			}
			else {
				fish.move();
			}
			
		}
		
	}

}
