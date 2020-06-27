package com.company;

import java.util.Scanner;

public class SecurityManager {
    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;

    public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck) {
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
    }

    public void check() {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose option: 1 - KeyCard, 2 - PinCode: ");
        int option = s.nextInt();
        switch(option) {
            case 1:
                System.out.println(this.keyCardCheck.validateUser());
                break;
            case 2:
                System.out.println(this.pinCodeCheck.validateUser());
                break;
            default:
                break;
        }
    }
}
