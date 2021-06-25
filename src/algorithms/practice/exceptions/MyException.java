package algorithms.practice.exceptions;

public class MyException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2588825750473252657L;

	public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}