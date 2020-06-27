package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new Employee("Name");
        Manager manager = new Manager("Manager Name");

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(manager);

        DetailsPrinter printer = new DetailsPrinter(employeeList);
        printer.printDetails();
    }
}
