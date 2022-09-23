package sahana;

import java.util.Scanner;

public class Main {
        private static Scanner sc;
		public static int countTotalBirds(int rowNumber)
        {
        	int a=1,b=2;
        	int i=2;
        	int total=0;
        	if(rowNumber==1)
        		return a;
        	if(rowNumber==1)
        		return b;
        	while(i<rowNumber) {
        		total=b+a;
        	    a=b;
        	    b=total;
        	    i++;
        }
         return total;
  }   
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int totalBirds=countTotalBirds(sc.nextInt());
		System.out.println("The total number of birds are:"+totalBirds);

	}

}
