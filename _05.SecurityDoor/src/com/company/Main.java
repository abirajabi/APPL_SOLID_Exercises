package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ScannerUI scannerUi = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUi);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUi);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.check();
    }
}
