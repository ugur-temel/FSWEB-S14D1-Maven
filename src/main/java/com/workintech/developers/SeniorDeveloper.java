package com.workintech.developers;

public class SeniorDeveloper extends  Employee{
    public SeniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }
    public void work(){
        setSalary(getSalary() * 1.20);
        System.out.println("Senior Developer is taking a nap");
    }
}