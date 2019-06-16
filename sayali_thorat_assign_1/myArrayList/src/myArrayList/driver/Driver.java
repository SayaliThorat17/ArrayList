package myArrayList.driver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;


/**
 * @author Sayali Thorat
 *
 */
public class Driver {


		public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

		/*if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		} */

		System.out.println("Hello World! Lets get started with the assignment");


		//to read input file
		File file = new File("input.txt");

		BufferedReader br = null;

		try {
				FileReader fr = new FileReader(file);
				br = new BufferedReader(fr);

				String line;

				while( (line = br.readLine()) != null)
				{
					System.out.println(line);
					//int number = Integer.parseInt(line);
					//list.insertSorted(number);

				}
		} catch (FileNotFoundException e) {

			System.out.println("File not found:" + file.toString());
		}catch(IOException e) {

			System.out.println("Unable to read file: " + file.toString());
		}
		finally {
			try {
				br.close();
			}catch (IOException e) {
				System.out.println("Unable to close file: " + file.toString());
			}
			catch(NullPointerException ex) {
				//File was probably never opened !
			}
		}





		}
}
