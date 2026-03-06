
public class MovableCircle implements Movable { 
  private MovablePoint center;
  private int radius;
  private int xSpeed;
  private int ySpeed;
  
  // TASK: Add the constructor here
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }
  
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }

  @Override
  public void moveDown() {
    center.moveDown();
  }

  @Override
  public void moveLeft() {
    center.moveLeft();
  }

  @Override
  public void moveRight() {
    center.moveRight();
  }

  public String toString() {
    return String.format("MovableCircle[radius=%d,x=%d,y=%d,xSpeed=%d,ySpeed=%d]", radius, center.x, center.y, xSpeed, ySpeed);
  }

}
