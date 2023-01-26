/**
 * Class that defines a cuckoo clock object
 * 
 * @author vivianhaile
 */
public class CuckooClock extends Clock
{
	private static double DRIFT_PER_SECOND = 0.000694444;
	
	/**
	 * Constructor - uses clock constructor to create a cuckoo clock
	 * gives parameters to clock constructor
	 */
	public CuckooClock()
	{
		super(ClockType.MECHANICAL, DRIFT_PER_SECOND);
	}

	@Override
	public void display() 
	{
		String str = "mechanical, cuckoo clock, time [" + time.formattedTime() + "], total drift = " + 
		secFormat.format(time.getTotalDrift()) + " seconds";
		System.out.println(str);		
	}
}

