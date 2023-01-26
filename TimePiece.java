/**
 * Interface for an object that keeps track of time
 * 
 * @author vivianhaile
 */
public interface TimePiece 
{
	/**
	 * reset the time of the time piece
	 */
	public void reset();
	
	/**
	 * run the time piece one unit of time
	 */
	public void tick();
	
	/**
	 * print out information about the time piece
	 * include a detailed description of the time piece
	 * include formatted time and total drift
	 */
	public void display();
}
