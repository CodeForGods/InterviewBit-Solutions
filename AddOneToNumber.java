import java.util.*;

import java.util.List.*;
class AddOneToNumber{

	//Start
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		ArrayList<Integer> B = new ArrayList<Integer>();

		
		int end = A.size()-1;
		int carry =0;

		while(end>=0){
			int sum = 0;
			if(end==A.size()-1){

				sum = A.get(end)+1;

			}
			else{
				sum = A.get(end);
			}

			sum = sum+carry;

			if(sum>=10){

				carry =1;

			}else{
				carry =0;
			}
		
			B.add(sum%10);
			end--;
		}

		B.add(carry);
		

		while(B.get(B.size()-1)==0){
			B.remove(B.size()-1);
		}
		

		Collections.reverse(B);
		return B;


	}
	//end

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();

		A.add(0);
		A.add(2);
		A.add(3);
		AddOneToNumber addOneToNumber = new AddOneToNumber();
		System.out.println(addOneToNumber.plusOne(A));
	}

}
