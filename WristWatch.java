/**
 * Class that defines a wrist watch clock object
 * 
 * @author vivianhaile
 */
public class WristWatch extends Clock
{
	private static double DRIFT_PER_SECOND = 0.000034722;
	
	/**
	 * Constructor - uses clock constructor to create a wrist watch
	 * gives parameters to clock constructor
	 */
	public WristWatch()
	{
		super(ClockType.DIGITAL, DRIFT_PER_SECOND);
	}

	@Override
	public void display() 
	{
		String str = "digital, wrist watch, time [" + time.formattedTime() + "], total drift = " + 
		secFormat.format(time.getTotalDrift()) + " seconds";
		System.out.println(str);		
	}
}
