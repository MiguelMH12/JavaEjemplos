public class DataTypes {
	public static void main(String[] args) {
		//INTEGER TYPES
		byte myByte = 100;   //-128 to 127
		short myShort = 5000;   //-32,768 to 32,767
		int myInt = 100000;  //-2,147,483,648 to 2,147,483,647
		/*int data type is the preferred when we create a numeric variables */
		long myLong = 15000000000L;   //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

		//FLOATING POINT TYPES
		float myFloat = 35e3f;  //3.4e-038 to 3.4e+038, the 'e' is for Scientific numbres, indicate the power of 10
		double myDouble = 12E4d;  //1.7e-308 to 1.7e+038
		/*with float we've a precision of six or seven decimal digits, while double variables the precision is about 15 digits, more recomendable */
		boolean isJavaFun = true;
		boolean isJavaTasty = false;
		char myChar = 'B'; //For single characteror we can use the ASCII values:
		char a = 97, b = 98, c = 99;
		String myString = "Hello World";  //Non primitive data type because it refers to an object, has methods

		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);

		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(isJavaFun);
		System.out.println(isJavaTasty);
		System.out.println(myChar);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(myString);
	}

}

/*Tipos primitivos son definidos por Java, los no primitivos son creados por el programador, excepto por String
Los datos primitivos siempre tienen un valor, mientras que los no primitivos pueden ser null
Primitivos inician con letra minuscula, No primitivos con mayúscula
Ejemplos: Strings, Arrays, Classes, Interfaces*/