package com.ankit.async;

/**
 * Created by ankit07 on 1/26/17.
 */
public class CalculationOfPie {
    public static void main(String[] args) {
        CalculationThread calculationThread = new CalculationThread();
        calculationThread.start();

                try{
                    Thread.sleep(10000);

                }catch (Exception e){
                    System.out.println("Exception caught!!!!");
                }

        System.out.println("Value of pie -> " + calculationThread.pi);
    }
}

class CalculationThread extends Thread{
    boolean negative = true;
    double pi; // Initializes to 0.0, by default
    public void run ()
    {
        System.out.println("Called Calcuation of Pie!!!");
        for (int i = 3; i < 100000; i += 2)
        {
            if (negative)
                pi -= (1.0 / i);
            else
                pi += (1.0 / i);
            negative = !negative;
        }
        pi += 1.0;
        pi *= 4.0;
        System.out.println ("Finished calculating PI");
    }
}
