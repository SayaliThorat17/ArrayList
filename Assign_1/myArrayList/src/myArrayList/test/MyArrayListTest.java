package myArrayList.test;

import myArrayList.util.Results;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import myArrayList.MyArrayList;
public class MyArrayListTest {
	private String inputFile;
	public  MyArrayListTest(String inputFile) {
		this.inputFile=inputFile;
	}
	public void testMe(MyArrayList arrObj, Results resObj) throws IOException {

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(inputFile));
			String line = br.readLine();
			while (line != null) 
			{
				//System.out.println(line);
				arrObj.insertSorted(Integer.parseInt(line));
				line = br.readLine();
			}
		}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		resObj.writeToFile("\nThe sum of all the values in the array list is: " + arrObj.sum()+"\n");
		arrObj=new MyArrayList();
		
		//Test Case Single Insert
		arrObj.insertSorted(100);
		if (arrObj.size()==1) {
			resObj.writeToFile("Insert Single Element Test :- Passed");
		}
		else
		{
			resObj.writeToFile("Insert Single Element Test :- Failed");
		}
		
		
		// Test Case Delete
				arrObj.removeValue(100);
				if (arrObj.size()==0) {
					resObj.writeToFile("Delete Single Element Test :- Passed");
				}
				else
				{
					resObj.writeToFile("Delete Single Element Test :- Failed");
				}
		
		// Test Case Insert
		arrObj.insertSorted(10);
		arrObj.insertSorted(20);
		arrObj.insertSorted(30);
		if (arrObj.size()==3) {
			resObj.writeToFile("Insert Elements Test :- Passed");
		}
		else
		{
			resObj.writeToFile("Insert Elements Test :- Failed");
		}
		
		
		
		
		// Test Case Sort
		arrObj=new MyArrayList();
		arrObj.insertSorted(50);
		arrObj.insertSorted(10);
		arrObj.insertSorted(30);
		if (arrObj.indexOf(10)==0 && arrObj.indexOf(30)==1 && arrObj.indexOf(50)==2) {
			resObj.writeToFile("Array equality Test  :- Passed");
		}
		else
		{
			resObj.writeToFile("Array equality Test :- Failed");
		}
		
		//Test Case sum
		if (arrObj.sum()==90) {
			resObj.writeToFile("Sum Test  :- Passed");
		}
		else
		{
			resObj.writeToFile("Sum Test  :-           Failed");
		}
		//Test case index of
		if (arrObj.indexOf(50)==2) {
			resObj.writeToFile("Index Test  :- Passed");
		}
		else
		{
			resObj.writeToFile("Index Test  :-           Failed");
		}
		
		// Test case size 
		if (arrObj.size()==3) {
			resObj.writeToFile("Array Size Test  :- Passed");
		}
		else
		{
			resObj.writeToFile("Array Size Test  :-           Failed");
		}
		
		//Test case dynamic array 
		arrObj=new MyArrayList();
		for (int i = 0; i < 100; i++)
		{
			arrObj.insertSorted(i);
		}
		if (arrObj.size()==100) {
			resObj.writeToFile("Dynamic Array Size Increase Test  :- Passed");
		}
		else
		{
			resObj.writeToFile("Dynamic Array Size Increase Test  :-           Failed");
		}
		//Test compact
		arrObj=new MyArrayList();
		arrObj.insertSorted(50);
		arrObj.insertSorted(10);
		arrObj.insertSorted(30);
		arrObj.insertSorted(30);
		//arrObj.printInsertionOrder();
		arrObj.removeValue(30);
		//arrObj.printInsertionOrder();
		arrObj.compact();
		if (arrObj.size()==2) {
			resObj.writeToFile("Compact Test  :- Passed");
		}
		else
		{
			resObj.writeToFile("Compact Test  :-           Failed");
		}
		
		
		//Multiple delete
		
		arrObj=new MyArrayList();
		arrObj.insertSorted(50);
		arrObj.insertSorted(10);
		arrObj.insertSorted(30);
		arrObj.insertSorted(30);
		arrObj.removeValue(30);
		if (arrObj.size()==2) 
		{
			resObj.writeToFile("Multiple Delete Test  :- Passed");
		}
		else {
			resObj.writeToFile("Multiple Delete Test  :- Failed");
		}
		
		
		}
	}
