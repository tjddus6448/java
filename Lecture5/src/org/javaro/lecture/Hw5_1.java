package org.javaro.lecture;

public class Hw5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int checkP = 0;
	      for (int i = 1 ; i < 31 ; i++) {
	            checkP = 1;
	            for (int n = 2; n < i; n++) {
	               if (i % n == 0) {
	                  checkP = 0;
	                  continue;
	               }  
	            }
	            if (checkP == 1)
	               System.out.print(i+",  ");
	         }

	   }

	}
