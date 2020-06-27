package com.company;

import com.company.Intefaces.ISecurityUI;

import java.util.Scanner;

public class ScannerUI implements ISecurityUI {
    @Override
    public String requestKeyCard() {
        Scanner s = new Scanner(System.in);
        System.out.println("Slide your key card");
        return s.nextLine();
    }

    @Override
    public int requestPinCode() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your pin code: ");
        return s.nextInt();
    }
}
