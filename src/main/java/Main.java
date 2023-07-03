package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        FreelanceServices services = new FreelanceServices();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int month = FreelanceServices.calculate(income, expenses, threshold);

        System.out.println("Месяцев отдыха: " + month);
    }
}