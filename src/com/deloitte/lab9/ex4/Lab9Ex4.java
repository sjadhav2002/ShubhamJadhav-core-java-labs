package com.deloitte.lab9.ex4;
import java.util.function.BiFunction;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + id + "]";
    }
}

public class Lab9Ex4 {
    public static void main(String[] args) {
        BiFunction<String, Integer, Employee> employeeFactory = Employee::new;
        Employee emp1 = employeeFactory.apply("Shubham", 101);
        System.out.println(emp1);
    }
}