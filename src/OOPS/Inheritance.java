package OOPS;

import sample.Example;

public class Inheritance extends Example {
 // fetching data from other class using extends keyword
// extends keyword not required if we try to fetch data from the same package but different class
	
	public static void main(String[] args) {
		Example obj = new Example();
		obj.name();
		obj.inti();
		obj.booleanstr();
		
	}

}
