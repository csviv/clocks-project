import java.util.Iterator;

/**
 * Class that creates a bag of clocks
 * Displays the time and total drift of each clock after different periods of time
 * total drift - the amount of time lost by a clock as it runs
 * 
 * @author vivianhaile
 */
public class ClockSimulation 
{
	//instance variables
	private static Bag<Clock> clockBag;
	private static Iterator<Clock> clockIterator;
	
	//periods of time in seconds
	private static long ONE_DAY = 86400;
	private static long ONE_WEEK = 604800;
	private static long ONE_MONTH = 2592000;
	private static long ONE_YEAR = 31536000;
	
	/**
	 * main method - creates a bag of clocks
	 * prints information about the clocks at different times
	 * @param args - no args are used
	 */
	public static void main(String[] args) 
	{
		//make a new bag and add clocks to it
		clockBag = new Bag<Clock>();
		clockBag.add(new GrandfatherClock());
		clockBag.add(new AtomicClock());
		clockBag.add(new Sundial());
		clockBag.add(new WristWatch());
		clockBag.add(new CuckooClock());
		
		//print out clock info before start
		System.out.println("Times before start:");		
		displayClocks();
		
		//print out clock info after one day of running
		System.out.println("After one day:");	
		runClocks(ONE_DAY);	
		displayClocks();
		
		//print out clock info after one week of running
		System.out.println("After one week:");	
		resetClocks();
		runClocks(ONE_WEEK);		
		displayClocks();
		
		//print out clock info after one month of running
		System.out.println("After one month:");
		resetClocks();
		runClocks(ONE_MONTH);
		displayClocks();
		
		//prints out clock info after one year of running
		System.out.println("After one year:");
		resetClocks();
		runClocks(ONE_YEAR);
		displayClocks();
		
		
	}
	
	/**
	 * calls the clock's display method on each clock in the bag
	 */
	private static void displayClocks()
	{
		clockIterator = clockBag.iterator();
		while(clockIterator.hasNext()) 
		{
		    clockIterator.next().display();
		}
		System.out.println();
	}
	
	/**
	 * runs each clock in bag for given time period 
	 * uses the time class tick method
	 * @param timePeriod - period of time to run the clocks for
	 */
	private static void runClocks(long timePeriod)
	{
		clockIterator = clockBag.iterator();			
		while(clockIterator.hasNext()) 
		{
			Clock currentClock = clockIterator.next();
			//tick the clock for the required number of seconds
			for (int i = 0; i < timePeriod; i++)
			{
				currentClock.tick();
			}
		}
	}
	
	/**
	 * resets the time of each clock in the bag to midnight
	 * uses time class reset method
	 */
	private static void resetClocks()
	{
		clockIterator = clockBag.iterator();			
		while(clockIterator.hasNext()) 
		{
			clockIterator.next().reset();	
		}
	}
}
