package com.project.harman;


import java.util.Scanner;



class SinFunction extends Thread
{
    double x;
    public SinFunction(double x)
    {
        this.x = x;
    }

    @Override
    public void run()
    {
        System.out.println("Sin Function = " +Math.sin(x));
    }
}



class CosFunction extends Thread{
    double x;
    public CosFunction(double x)
    {
        this.x = x;
    }

    @Override
    public void run()
    {
        System.out.println("Cos Function = " +Math.cos(x));
    }
}


class TanFunction extends Thread
{
    double x;
    public TanFunction(double x)
    {
        this.x = x;
    }

    @Override
    public void run()
    {
        System.out.println("Tan Function = " +Math.tan(x));
    }
}


public class Trignometric_Operations
{
    public static void main(String[] args)
    {
        double theta;  // Use Double for the long values and Decimals too

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the angle = : ");
        theta = inp.nextDouble();

        SinFunction sin_Obj = new SinFunction(Math.toDegrees(theta));

        CosFunction cos_Obj = new CosFunction(Math.toDegrees(theta));

        TanFunction tan_Obj = new TanFunction(Math.toDegrees(theta));

        sin_Obj.start();

        cos_Obj.start();

        tan_Obj.start();
    }
}
