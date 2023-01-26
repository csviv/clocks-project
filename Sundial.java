/**
 * Class that defines a sundial clock object
 * 
 * @author vivianhaile
 */
public class Sundial extends Clock
{
	private static double DRIFT_PER_SECOND = 0.00;
	
	/**
	 * Constructor - uses clock constructor to create a sundial
	 * gives parameters to clock constructor
	 */
	public Sundial()
	{
		super(ClockType.NATURAL, DRIFT_PER_SECOND);
	}

	@Override
	public void display() 
	{
		String str = "natural, sun dial, time [" + time.formattedTime() + "], total drift = " + 
		secFormat.format(time.getTotalDrift()) + " seconds";
		System.out.println(str);		
	}
}
