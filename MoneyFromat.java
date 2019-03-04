package com.sysoutachieve.testdatehandle;

import java.text.DecimalFormat;

public class MoneyFromat {

    // '원' 특수문자를 이용하고 싶을 땐 param letter에 "\uFFE6"

    public String moneyFormatBackLetter(String inputMoney, String letter) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0");
            return decimalFormat.format(Integer.parseInt(inputMoney)) + letter + "";
        } catch (Exception e) {

        }
        return inputMoney + "";
    }

    public String moneyFormatFrontLetter(String inputMoney, String letter) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0");
            return letter + decimalFormat.format(Integer.parseInt(inputMoney)) + "";
        } catch (Exception e) {

        }
        return inputMoney + "";
    }

}
