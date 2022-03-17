package ru.netology.web.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class CardNumbers {
        private String number;
        private int balance;

        public static CardNumbers getCardOne() {
            return new CardNumbers("5559 0000 0000 0001", 10_000);
        }

        public static CardNumbers getCardTwo() {
            return new CardNumbers("5559 0000 0000 0002", 10_000);
        }

    }
}
