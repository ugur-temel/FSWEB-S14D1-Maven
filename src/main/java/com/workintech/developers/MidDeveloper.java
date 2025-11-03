package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }
    public void work(){
        setSalary(getSalary() * 1.17);
        System.out.println("MidDeveloper is getting coffee");
    }
}
