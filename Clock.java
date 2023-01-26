import java.text.DecimalFormat;
/**
 * Abstract class that defines a clock time piece object
 * Implements some of the methods listed in the time piece interface
 * 
 * @author vivianhaile
 */
public abstract class Clock implements TimePiece 
{	
	protected Time time;
	private ClockType clockType;
	protected DecimalFormat secFormat; //used by child classes to format display
	
	/**
	 * Enumeration for clock objects
	 * Includes different types of clocks
	 */
	public enum ClockType
	{
		NATURAL, MECHANICAL, DIGITAL, QUANTUM;
	}
	
	/**
	 * Constructor - creates a clock object with the time set to midnight
	 * @param cType - type of clock to create
	 * @param cDrift - drift (amount of time lost) per second of clock to create
	 */
	public Clock(ClockType cType, double cDrift)
	{
		clockType = cType;
		time = new Time(cDrift);
		secFormat = new DecimalFormat("0.00");
	}
	
	/**
	 * Getter for the type of a clock
	 * @return clockType - the type of a clock
	 */
	public ClockType getType()
	{
		return clockType;		
	}
	
	/**
	 * Setter - sets the type of a clock
	 * @param newType - the type to set a clock to
	 */
	public void setType(ClockType newType)
	{
		clockType = newType;
	}

	@Override
	public void reset() 
	{
		time.resetToStartTime();
	}

	@Override
	public void tick() 
	{
		//runs the clock 1 second, like a tick of a clock
		time.incrementTime(); 
		
	}
}
