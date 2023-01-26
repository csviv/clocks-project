/**
 * Class that defines a grandfather clock object
 * 
 * @author vivianhaile
 */
public class GrandfatherClock extends Clock
{
	private static double DRIFT_PER_SECOND = 0.000347222;
	
	/**
	 * Constructor - uses clock constructor to create a grandfather clock
	 * gives parameters to clock constructor
	 */
	public GrandfatherClock()
	{
		super(ClockType.MECHANICAL, DRIFT_PER_SECOND);
	}

	@Override
	public void display() 
	{
		String str = "mechanical, grandfather clock, time [" + time.formattedTime() + "], total drift = " + 
		secFormat.format(time.getTotalDrift()) + " seconds";
		System.out.println(str);		
	}	
}
