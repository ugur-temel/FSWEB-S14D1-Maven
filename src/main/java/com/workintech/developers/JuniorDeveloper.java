package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary){
        super(id, name, salary);
    }
    public void work(){
        setSalary(getSalary() * 1.15);
        System.out.println("JR Developer is chatting with ChatGPT");
    }
}
