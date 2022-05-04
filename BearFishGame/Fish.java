import java.util.Random;

public class Fish extends GameObject {
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	@Override
	public void move() {
		if(new Random().nextInt(5)==0 || new Random().nextInt(5)==1) {		// fish 5번중에 2번 움직이기, 3번 제자리
			switch(new Random().nextInt(4)) { 		// 움직이기: 4가지 방향중 랜덤으로 한칸 이동
			case 0:
				if(y<=0)	y=0;
				else	y=y-distance;
				break;
			case 1:
				if(y>=19)	y=19;
				else		y=y+distance;
				break;
			case 2:	
				if (x>=9)	x=9;
				else		x=x+distance;
				break;
			case 3:
				if(x<=0)	x=0;
				else	x=x-distance;
				break;
			}
		}
		else {			// 제자리
		}
	}
	
	
	@Override
	public char getShape() {
		return 'F';
	}
}
