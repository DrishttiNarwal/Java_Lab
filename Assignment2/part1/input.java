package assignment2_part1;

import java.util.Scanner;
public class input {
    public int[] inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int size=sc.nextInt();
        int data[]=new int[size];
        System.out.println("Enter data");
        for (int i=0;i<size;i++)
            data[i]=sc.nextInt();
        return data;
    }

}