package myArrayList.driver;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
import myArrayList.util.Results;

public class Driver {
public static void main(String[] args) throws FileNotFoundException, IOException {
	if ( args.length != 2 )
	{
		System.out.println("Missing Input or Output File");
		System.out.println("Run the program as  : ant -buildfile build.xml run -Darg0=infile.txt -Darg1=outfile.txt");
		System.exit(0);
	}
	String inputFile = args[0];
	String outputFile = args[1];
	System.out.println("Argo 0 "+inputFile);
	System.out.println("Argo 1 "+outputFile);
	MyArrayList myArrayListObj = new MyArrayList();
	Results resultObj = new Results(outputFile);
	MyArrayListTest testObj = new MyArrayListTest(inputFile);
	
	testObj.testMe(myArrayListObj, resultObj);
	
	//System.out.println(result.toString());
	//result.ResulttoFile();
}
}
