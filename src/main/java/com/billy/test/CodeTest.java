package com.billy.test;

public class CodeTest {

    public CodeTest(){
        //testing
    }

    public void itterateMultiples(int numberToItterate, int lengthToItterate){

        System.out.println("Itterating by: " + numberToItterate);
        for (int i = numberToItterate; i <= lengthToItterate; i = i + numberToItterate) {
            System.out.println(i);
        }

        System.out.println("Itterating by: " + numberToItterate +1);
        for (int i = numberToItterate+1; i <= lengthToItterate * 2; i = i + numberToItterate ) {
            System.out.println(i);
        }
    }
}
