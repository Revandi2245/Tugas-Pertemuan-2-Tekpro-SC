package pertemuan2;

public class AddNum {
	/**
	 * This method is used to add two integers. this is a the simplest form of a
	 * class method, just to show the usage of various javadoc Tags.
	 * 
	 * @param numA This is the first parameter to addNum method
	 * @param numB This is the second parameter to addNum method
	 * @return int This returns sum of numA and numB.
	 */

	public int addNum(int numA, int numB) {
		return numA + numB;
	}

	/**
	 * This in the main method which makes use of addNum method.
	 * 
	 * @param args Unused
	 * @exception IOException On input error
	 * @see IOException
	 */

	public static void main(String args[])  {
		AddNum obj = new AddNum();
		int sum = obj.addNum(10, 20);
		System.out.println("Sum of 10 and 20 is :" + sum);
	}
}