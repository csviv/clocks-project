/**
 * Class that defines an atomic clock object
 * 
 * @author vivianhaile
 */
public class AtomicClock extends Clock
{
	private static double DRIFT_PER_SECOND = 0.0;
	
	/**
	 * Constructor - uses clock constructor to create an atomic clock
	 * gives parameters to clock constructor
	 */
	public AtomicClock()
	{
		super(ClockType.QUANTUM, DRIFT_PER_SECOND);
	}

	@Override
	public void display() 
	{
		String str = "quantum, atomic clock, time [" + time.formattedTime() + "], total drift = " + 
		secFormat.format(time.getTotalDrift()) + " seconds";
		System.out.println(str);		
	}
}
