package myArrayList.driver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import myArrayList.MyArrayList;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		MyArrayList myArrayObject=new MyArrayList();
		// TODO Auto-generated method stub
		System.out.println("Test");
		try(BufferedReader br = new BufferedReader(new FileReader("InputFile.txt"))) {
			//StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				//System.out.println(line);
				myArrayObject.insertSorted(Integer.parseInt(line));
				line = br.readLine();
			}
			// String everything = sb.toString();
		}
		myArrayObject.printInsertionOrder();
		System.out.println("Index of element  "+myArrayObject.indexOf(1234));
		System.out.println("Sum of array  "+myArrayObject.sum());
		myArrayObject.removeValue(123);
		myArrayObject.printInsertionOrder();
		myArrayObject.removeValue(1234);
		myArrayObject.printInsertionOrder();
		myArrayObject.removeValue(12);
		myArrayObject.printInsertionOrder();
		System.out.println(myArrayObject.size());
	}
}
