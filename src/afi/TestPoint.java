package afi;

public class TestPoint {
	public static void main(String[] args) {
		
		Point point = new Point(1, 2);
		
		point.x;
	}
}

class Point {
	
	public final int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
