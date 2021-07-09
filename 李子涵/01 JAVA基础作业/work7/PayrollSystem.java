package com.qmx.work7;

public class PayrollSystem {
    public int i = 0;
    public int sum = 0;
    public int j;
    public Employee[] c = new Employee[10];
    public PayrollSystem(Employee cs)
    {
        c[i] = cs;
        i++;
        sum = sum + 1;
    }
    public void addP(Employee cs)
    {
        c[i] = cs;
        i++;
        sum = sum + 1;
    }
    public void showArrays(){
        for(j=0;j<sum;j++)
        {
            System.out.println(c[j].toString());
        }
    }
}
