package ru.geekbrains.tina.lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("ФИО: " + name + " Должность: " + position + " email: " + email + " телефон: " + phone + " зарплата: " + salary + " возраст " + age);
    }
}