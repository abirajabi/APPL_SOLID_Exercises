package com.company;

import com.company.Intefaces.ISecurityUI;

public class KeyCardCheck extends SecurityCheck {
    private ISecurityUI securityUI;

    public KeyCardCheck(ISecurityUI securityUI) {
        this.securityUI = securityUI;
    }

    private boolean isValid(String code) {
        return true;
    }

    @Override
    boolean validateUser() {
        String code = securityUI.requestKeyCard();
        if (isValid(code)) {
            return true;
        }
        return false;
    }
}
