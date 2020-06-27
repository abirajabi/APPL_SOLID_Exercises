package com.company.Models;

import com.company.Interfaces.IRechargeable;

public class RechargeStation {
    public void recharge(IRechargeable rechargeable) {
        rechargeable.recharge();
    }
}
