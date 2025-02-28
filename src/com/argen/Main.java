package com.argen;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 5000);
        DatabaseSaver dbSaver = new SimpleDatabaseSaver();
        BonusCalculator bonusCalc = new SimpleBonusCalculator();
        PayslipPrinter printer = new SimplePayslipPrinter();

        dbSaver.saveToDatabase(emp);
        System.out.println("Bonus: " + bonusCalc.calculateBonus(emp));
        printer.printPayslip(emp);
    }
}
