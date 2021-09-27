/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;


    public class exercise36 {

        static double average(ArrayList<Integer> numArray)
        {
            double total = 0;
            for (int i = 0; i < numArray.size(); i++)
            {
                total += (double)numArray.get(i);
            }

            double answer = (total / ((double)numArray.size()));
            double extre = answer % 0.1;
            return answer - extre;
        }

        static int max(ArrayList<Integer> numArray)
        {
            int max = numArray.get(0);
            for (int i = 1; i < numArray.size(); i++)
            {
                if(numArray.get(i) > max)
                {
                    max = numArray.get(i);
                }
            }
            return max;
        }

        static int min(ArrayList<Integer> numArray)
        {
            int min = numArray.get(0);
            for (int i = 1; i < numArray.size(); i++)
            {
                if(numArray.get(i) < min)
                {
                    min = numArray.get(i);
                }
            }
            return min;
        }

        static double std(ArrayList<Integer> numArray)
        {
            double avg = average(numArray);
            double sumDif = 0;
            for (int i = 0; i < numArray.size(); i++)
            {
                sumDif += Math.pow((numArray.get(i) - avg), 2);
            }

            sumDif = sumDif / (numArray.size());
            double ret = Math.sqrt(sumDif);
            double extra = ret % 0.1;
            return ret - extra;
        }


        public static void main(String[] args) {

            ArrayList<Integer> numArray = new ArrayList<Integer>();
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String x = input.nextLine();
            boolean done = false;

            while(!done)
            {
                numArray.add(Integer.parseInt(x));

                System.out.print("Enter a number: ");
                x = input.nextLine();

                if(x.equals("done"))
                {
                    done = true;
                }
            }

            System.out.print("Numbers: " + numArray.get(0));
            for(int i = 1; i < numArray.size(); i++)
            {
                System.out.print(", " + numArray.get(i));
            }

            System.out.println();
            System.out.println("The average is " + average(numArray));
            System.out.println("The minimum is " + min(numArray));
            System.out.println("The maximum is " + max(numArray));
            System.out.println("The standard deviation is " + std(numArray));

        }
}
