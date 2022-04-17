package Lab6_1;

import java.util.Scanner;

import Lab6_1.Solution.Liquid;

import java.lang.Math;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        Solution s1 = new Solution();
        System.out.println("Solution: " + Solution.GetCounter());
        System.out.println("Solution::Liquid: " + Solution.Liquid.GetCounter());
        System.out.println("s1: " + s1.ToString());
        System.out.println();

        Solution s2 = new Solution();
        s2.Read();
        System.out.println();
        System.out.println("Solution local: " + Solution.GetCounter());
        System.out.println("Solution::Liquid local: " + Solution.Liquid.GetCounter());
        System.out.println("s2: " + s2.ToString());
        System.out.println();

        Solution s3 = new Solution("Tea", 1000, 50);
        System.out.println("Solution local: " + Solution.GetCounter());
        System.out.println("Solution::Liquid local: " + Solution.Liquid.GetCounter());
        System.out.println("s3: " + s3.ToString());
        System.out.print("Change Liquid Quantity: ");
        double temp = scan.nextDouble();
        s3.SetLiquidQuantity(temp);
        System.out.println("s3(changed): " + s3.ToString());
        System.out.println();

        Solution.plusOneSolution(s3);
        System.out.println("s3++: " + s3.ToString());
        Solution.minusOneSolution(s3);
        System.out.println("s3--: " + s3.ToString());
        Solution.onePlusSolution(s3);
        System.out.println("++s3: " + s3.ToString());
        Solution.oneMinusSolution(s3);
        System.out.println("--s3: " + s3.ToString());
	}

}
