package Lab6_1;

import java.util.Scanner;
import java.lang.Math;

public class Solution {

	static Scanner scan = new Scanner(System.in);

	private Liquid liquid;
    double liquid_quantity;
    static int counter;
    public static class Liquid
    {
        private String liquid_name;
        private double liquid_density;
        private static int counter = 0;
        public Liquid()
        {
            liquid_name = "";
            liquid_density = 0.0;
            counter++;
        }
        public Liquid(String liquid_name, double liquid_density)
        {
            this.liquid_name = liquid_name;
            this.liquid_density = liquid_density;
            counter++;
        }
        public Liquid(Liquid l)
        {
            this.liquid_name = l.liquid_name;
            this.liquid_density = l.liquid_density;
            counter++;
        }
        public String GetLiquidName()
        {
            return this.liquid_name;
        }
        public double GetLiquidDensity()
        {
            return this.liquid_density;
        }
        public static int GetCounter()
        {
            return counter;
        }
        public void SetLiquidName(String liquid_name)
        {
            this.liquid_name = liquid_name;
        }
        public void SetLiquidDensity(double liquid_density)
        {
            this.liquid_density = liquid_density;
        }
        public boolean Init(String liquid_name, double liquid_density)
        {
            if (liquid_density > Math.pow(10, -33) && liquid_density < Math.pow(10, 14))
            {
                SetLiquidName(liquid_name);
                SetLiquidDensity(liquid_density);
                return true;
            }
            return false;
        }
        public void Display()
        {
        	System.out.println("Liquid Name: " + liquid_name + " Liquid Density: " + liquid_density);
        }
        public void Read()
        {
            String name;
            double density;
            do
            {
            	System.out.println("Liquid Name: ");
                name = scan.nextLine();
                System.out.println("Liquid Density: ");
                density = scan.nextDouble();
            } while (!Init(name, density));
        }
        public static Liquid minusOneLiquid(Liquid l)
        {
        	return new Liquid(l.liquid_name, l.liquid_density--);
        }

        public static Liquid plusOneLiquid(Liquid l)
        {
        	return new Liquid(l.liquid_name, l.liquid_density++);
        }

        public static Liquid oneMinusLiquid(Liquid l)
        {
        	return new Liquid(l.liquid_name, --l.liquid_density);
        }

        public static Liquid onePlusLiquid(Liquid l)
        {
        	return new Liquid(l.liquid_name, ++l.liquid_density);
        }

        public String ToString()
        {
            return "Liquid: [Liquid Name: " + this.liquid_name + ", " + "Liquid Density: " + this.liquid_density + "]";
        }
    }
    public Solution()
    {
        this.liquid = new Liquid();
        this.liquid_quantity = 0.0;
        counter++;
    }
    public Solution(Liquid liquid, double liquid_quantity)
    {
        this.liquid = liquid;
        this.liquid_quantity = liquid_quantity;
        counter++;
    }
    public Solution(Solution solution)
    {
        this.liquid = solution.liquid;
        this.liquid_quantity = solution.liquid_quantity;
        counter++;
    }
    public Solution(String liquid_name, double liquid_density, double liquid_quantity)
    {
        this.liquid_quantity = liquid_quantity;
        this.liquid = new Liquid(liquid_name, liquid_density);
        counter++;
    }
    public Liquid GetLiquid()
    {
        return this.liquid;
    }
    public double GetQuantity()
    {
        return this.liquid_quantity;
    }
    public static int GetCounter()
    {
        return counter;
    }
    public void SetLiquid(Liquid liquid)
    {
        this.liquid = liquid;
    }
    public void SetLiquidQuantity(double liquid_quantity)
    {
        this.liquid_quantity = liquid_quantity;
    }
    public void Display()
    {
    	System.out.println("Liquid Quantity: " + this.liquid_quantity);
        this.liquid.Display();
    }
    public void Read()
    {
        String name;
        double density;
        double quantity;
        do
        {
        	System.out.println("Liquid Name: ");
            name = scan.nextLine();
            System.out.println("Liquid Density: ");
            density = scan.nextDouble();
            System.out.println("Liquid Quantity: ");
            quantity = scan.nextDouble();
        } while (!this.liquid.Init(name, density));
        this.liquid_quantity = quantity;
    }
    public static Solution minusOneSolution(Solution solution)
    {
    	return new Solution(Liquid.minusOneLiquid(solution.liquid), solution.liquid_quantity--);
    }

    public static Solution plusOneSolution(Solution solution)
    {
    	return new Solution(Liquid.plusOneLiquid(solution.liquid), solution.liquid_quantity++);
    }

    public static Solution oneMinusSolution(Solution solution)
    {
    	return new Solution(Liquid.oneMinusLiquid(solution.liquid), --solution.liquid_quantity);
    }

    public static Solution onePlusSolution(Solution solution)
    {
    	return new Solution(Liquid.onePlusLiquid(solution.liquid), ++solution.liquid_quantity);
    }

    public String ToString()
    {
        return "Liquid: {" + this.liquid.ToString() + ", " + "Quantity: " + this.liquid_quantity + "}";
    }
}
