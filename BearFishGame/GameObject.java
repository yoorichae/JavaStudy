public abstract class GameObject {
	protected int distance;
	protected int x, y;
	
	public GameObject(int start_x, int start_y, int distance) {
		this.x = start_x;
		this.y = start_y;
		this.distance = distance;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean collide(GameObject p){
		if (this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	
	public abstract void move();
	public abstract char getShape();

}
