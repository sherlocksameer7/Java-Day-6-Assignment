package com.project.harman;

import java.util.Scanner;

class ADD_operation extends Thread
{
    int x,y;

    public ADD_operation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Addition Operation: ");
            System.out.println(x+y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class SUB_operation extends Thread
{
    int x,y;

    public SUB_operation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Subtraction Operation: ");
            System.out.println(x-y);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

class MUL_operation extends Thread
{
    int x,y;

    public MUL_operation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Multiplication Operation: ");
            System.out.println(x*y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class DIV_operation extends Thread
{
    int x,y;

    public DIV_operation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("Division Operation: ");
            System.out.println(x/y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Calci {

    public static void main(String[] args)
    {

        Scanner inp = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st Number: ");
        a = inp.nextInt();
        System.out.println("Enter 2nd Number: ");
        b = inp.nextInt();

        // use for loop in that for(int i=0; i<=10; i++){} inside of the object creation !!!

        ADD_operation add_obj = new ADD_operation(a,b);
        SUB_operation sub_obj = new SUB_operation(a,b);
        MUL_operation mul_obj = new MUL_operation(a,b);
        DIV_operation div_obj = new DIV_operation(a,b);

        add_obj.start();
        sub_obj.start();
        mul_obj.start();
        div_obj.start();

    }
}
