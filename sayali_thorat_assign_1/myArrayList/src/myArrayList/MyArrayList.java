package myArrayList;

public class MyArrayList {
	
	private int MyArrayList[];

	public MyArrayList() {
		// TODO Auto-generated constructor stub
		MyArrayList=new int[50];
		for (int i = 0; i < MyArrayList.length; i++) { 
			MyArrayList[i]=-1;
		}

	}
	public void insertSorted(int newValue) {
		//

		int count=this.size();
		//System.out.println("array size"+count);
		int i;
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
				for (int j = i+1; j < MyArrayList.length; j++) {
					int k=i;
					MyArrayList[i]=MyArrayList[j];
					k++;
				}
			}
		}
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
