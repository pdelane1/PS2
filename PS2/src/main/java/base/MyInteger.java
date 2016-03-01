package base;

public class MyInteger {
	
	// Declaring iValue
	private static int iValue;

	// Constructor
	public MyInteger(int iValue) {
		MyInteger.iValue = iValue;
	}
	
	// Create getter
	public int getiValue() {
		return iValue;
	}
	
	// This Method tests to see if iValue is even
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
			return false;
	}
	
	// This Method tests to see if iValue is odd
	public boolean isOdd() {
		if(iValue % 2 == 1) {
			return true;
		}
			return false;
	}

	// This MEthod tests to see if iValue is Prime
	public boolean isPrime() {
		for (int counter = 2; counter <= iValue/2; counter++) {
			if (iValue % counter == 0) {
				return false;
			}
		}
		return true;
	}

	// This method tests to see if a value is even

	public static boolean isEven(int integer) {
		if (integer % 2 == 0) {
			return true;
		}
			return false;
	}

	// This method tests to see if a value is odd
	public static boolean isOdd(int integer) {
		if (integer % 2 == 1) {
			return true;
			} 
			return false;
	}

	// This method tests to see if a value is prime
	public static boolean isPrime(int integer) {
		if (integer % 2 == 0){
			return false;
		}
		for (int counter = 3; counter*counter <= integer/2; counter+= 2) {
			if (integer % counter == 0) {
				return false;
			}
		}
		return true;
	}

	// This tests to see if MyInteger is even

	public static boolean isEven(MyInteger myInteger) {
		if (myInteger.getiValue() % 2 == 0) {
			return true;
		}
		else if (myInteger.getiValue() % 2 != 0){
		return false;
		}
		return false;
	}

	// This tests to see if MyInteger is odd
	public static boolean isOdd(MyInteger myInteger) {
		if (myInteger.getiValue() % 2 == 0) {
			return false;
		}
		else if (myInteger.getiValue() % 2 != 0){
			return true;
		}
		return true;
	}
	
	// This tests to see if MyInteger is prime
	public static boolean isPrime(MyInteger myInteger) {
		if (myInteger.getiValue() % 2 == 0){
			return false;
		}
		for (int counter = 3; counter*counter <= myInteger.getiValue(); counter+= 2) {
			if (myInteger.getiValue() % counter == 0) {
				return false;
			}
		}
			return true;
	}
	
	//This Method tests to see if an arbitrary integer is equal to iValue
	
	public static boolean equals(int integer ){
		if(integer == iValue){
			return true;
		}
			return false;
	}
	
	//This Method tests to see if iValue is equal to myInteger.getiValue
	public static boolean equals(MyInteger myInteger){
		if (iValue == myInteger.getiValue()) {
			return true;
		}
			return false;
	}
}
