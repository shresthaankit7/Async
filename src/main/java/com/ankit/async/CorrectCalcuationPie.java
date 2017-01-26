package com.ankit.async;

/**
 * Created by ankit07 on 1/26/17.
 */
public class CorrectCalcuationPie {

    public static void main(String[] args) {

        CalculationThread calculationThread = new CalculationThread();
        calculationThread.start();

        while (calculationThread.isAlive()){
            try {
                System.out.println("Main Thread Sleeping!!!!!");
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Value of Pie -> " + calculationThread.pi);
    }
}
