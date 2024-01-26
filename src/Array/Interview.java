package Array;

public class Interview {
public static void main(String args[]) {
	int array [] = {2,2,2,1,1,3,3,3,3,2,3,3,3};
	int count =0;
	boolean flag = false;
	for(int i=0;i<array.length;i++) {
		count =0;
		for(int j=i;j<array.length;j++) {
			if(array[i]==array[j]) {
				count++;
			}
			if(count > array.length/2) {
				System.out.println("print the Majority element : "+array[i]);
				flag = true;
				break;
			}
		}
	}
	if(!flag) {
		System.out.println("print the Majority element : "+ -1);
	}
}
}
