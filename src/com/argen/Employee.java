package com.argen;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

interface DatabaseSaver {
    void saveToDatabase(Employee employee);
}

interface BonusCalculator {
    double calculateBonus(Employee employee);
}

interface PayslipPrinter {
    void printPayslip(Employee employee);
}


class SimpleDatabaseSaver implements DatabaseSaver {
    public void saveToDatabase(Employee employee) {
        // Логика сохранения в базу данных
        System.out.println("Saving " + employee.getName() + " to database");
    }
}

class SimpleBonusCalculator implements BonusCalculator {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.1; // 10% бонус
    }
}

class SimplePayslipPrinter implements PayslipPrinter {
    public void printPayslip(Employee employee) {
        System.out.println("Payslip for " + employee.getName() + ": Salary = " + employee.getSalary());
    }
}

// Пример использования
