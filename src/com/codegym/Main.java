package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String REGEX_EMAIL = "^\\w+@\\w+(\\.\\w+){1,2}$";
    public static final String REGEX_ACCOUNT = "^[_a-z0-9]{6,12}$";
    public static final String REGEX_TELEPHONE_NUMBER = "^\\([0-9]{2}\\)-\\([0-9]{10}\\)$";
    public static final String REGEX_CLASSNAME = "^([P,A,C]{1})([0-9]{4})([G,H,I,K,L,M]{1})$";
    public static Scanner sc = new Scanner(System.in);
    public static Scanner inputString = new Scanner(System.in);

    public static boolean validate(String regex, String check) {
        Pattern pattern = Pattern.compile(regex);
        Matcher mathcher = pattern.matcher(check);
        return mathcher.matches();
    }

    public static void main(String[] args) {
        int choice = -1;
        do {
            System.out.println("1. Kiểm tra email.");
            System.out.println("2. Kiểm tra account.");
            System.out.println("3. Kiểm tra số điện thoại.");
            System.out.println("4. Kiểm tra tên lớp.");
            System.out.println("0. Thoát.");
            System.out.println("Nhập lự chọn của bạn: ");
            choice = sc.nextInt();
            if (choice > 4) {
                System.out.println("Chọn 1 để kiểm tra email!");
            }
            switch (choice) {
                case 1: {
                    doCheckEmail();
                    break;
                }
                case 2: {
                    doCheckAccount();
                    break;
                }
                case 3: {
                    doCheckPhoneNumber();

                    break;
                }
                case 4: {
                    doCheckClassName();
                    break;
                }
            }
        } while (choice != 0);

    }

    private static void doCheckClassName() {
        System.out.println("----KIỂM TRA TÊN LỚP HỌC----");
        while (true) {
            System.out.println("Nhập tên lớp: ");
            String className = inputString.nextLine();
            boolean isCheckClassName = validate(REGEX_CLASSNAME, className);
            if (isCheckClassName) {
                System.out.println("Tên lớp hợp lệ!");
                break;
            } else {
                System.out.println("Tên lớp không hợp lệ!");
            }
        }
    }

    private static void doCheckPhoneNumber() {
        System.out.println("----KIỂM TRA SỐ ĐIỆN THOẠI----");
        while (true) {
            System.out.println("Nhập số điện thoại: ");
            String phoneNumber = inputString.nextLine();
            boolean isCheckPhoneNumber = validate(REGEX_TELEPHONE_NUMBER, phoneNumber);
            if (isCheckPhoneNumber) {
                System.out.println("Số điện thoại hợp lệ!");
                break;
            } else {
                System.out.println("Số điện thoại không hợp lệ!");
            }
        }
    }

    private static void doCheckAccount() {
        System.out.println("----KIỂM TRA ACCOUNT----");
        while (true) {
            System.out.println("Nhập tên account: ");
            String acc = inputString.nextLine();
            boolean isCheckAccount = validate(REGEX_ACCOUNT, acc);
            if (isCheckAccount) {
                System.out.println("Account hợp lệ!");
                break;
            } else {
                System.out.println("Account không hợp lệ!");
            }
        }
    }

    private static void doCheckEmail() {
        System.out.println("----KIỂM TRA EMAIL----");
        while (true) {
            System.out.println("Nhập email: ");
            String email = inputString.nextLine();
            boolean isvalidateEmail = validate(REGEX_EMAIL, email);
            if (isvalidateEmail) {
                System.out.println("Email hợp lệ!");
                break;
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }
    }
}
