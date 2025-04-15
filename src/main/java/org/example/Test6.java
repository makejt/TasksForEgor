package org.example;

import java.util.List;


public class Test6 {
    public static void main(String[] args) {

        // Преобразовать в мапу, где ключ - номер счета (number), значение - код валюты (currency)

        List<Account> accounts = List.of(
                new Account("123456789", "BYN"),
                new Account("987654321", "RUB"),
                new Account("123456789", "BYN"),
                new Account("987654320", "USD"),
                new Account("987654322", "BYN"),
                new Account("987654323", "BYN"));





    }

    private static class Account{
        private String number;
        private String currency;

        public Account(String number, String currency) {
            this.number = number;
            this.currency = currency;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }


}
