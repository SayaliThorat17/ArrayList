package myArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
public class MyArrayList {
	private int MyArrayList[];
	private int TempMyArrayList[];
	
	public MyArrayList() {
		// TODO Auto-generated constructor stub

		for (int i = 0; i < MyArrayList.length; i++) {
			MyArrayList[i]=-1;
		}

	}
	public void insertSorted(int newValue) {
		//

		int count=this.size();
		//System.out.println("array size"+count);
		int i;
		if (size()==MAX) {
			TempMyArrayList=Arrays.copyOf(MyArrayList, MAX+25);

			for (int j = size(); j < TempMyArrayList.length; j++) {
				TempMyArrayList[j]=-1;
			}
			MyArrayList=TempMyArrayList;
		}
		for( i=0;i<count;i++){
			if( MyArrayList[i]>newValue)
				break;
		}
		for(int k=MyArrayList.length-2; k>=i; k--){
			MyArrayList[k+1]=MyArrayList[k];
		}
		MyArrayList[i]=newValue;
	}


	public void printInsertionOrder() {
		System.out.println("Inside print");
		for (int i = 0; i<size(); ++i) {
			System.out.println(MyArrayList[i]);
		}
	}
	public void removeValue(int value) {
		for (int i = 0; i < MyArrayList.length; i++) {
			if(MyArrayList[i]==value)
			{
				int k=i;
				for (int j = i+1; j < MyArrayList.length; j++) {

					MyArrayList[k]=MyArrayList[j];
					k++;
				}
				i=i-1;
			}
		}
	}
	public void compact() {
		TempMyArrayList=Arrays.copyOf(MyArrayList, size());
		MyArrayList=TempMyArrayList;
	}
	public int size() {
		int cnt=0;
		for (int i = 0; i < MyArrayList.length && MyArrayList[i]!=-1; i++) {
			cnt++;
		}
		return cnt;
	}
	public int sum() {
		int sum=0;
		for (int i = 0; i < size(); i++) {
			sum=sum+MyArrayList[i];
		}
		return sum;

	}
	public int indexOf(int value) {
		int index=0;
		for (int i = 0; i < MyArrayList.length && MyArrayList[i]!=-1; i++) {
			if(MyArrayList[i]==value)
			{
				break;
			}
			index++;
		}
		return index;
	}
}
