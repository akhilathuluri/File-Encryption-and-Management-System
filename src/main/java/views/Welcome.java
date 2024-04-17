package views;

import dao.UserDAO;
import model.User;
import service.GenerateOTP;
import service.SendOTPService;
import service.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Welcome {
    public void welcomeScreen() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the application");
        System.out.println("Press 1 to Login");
        System.out.println("Press 2 to Signup");
        System.out.println("Press 0 to exit");

        int choice = 0;
        try {
            choice = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                signUp();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email: ");
        String email = sc.nextLine();
        try {
            if(UserDAO.isExists(email)){
                String genOTP = GenerateOTP.getOTP();
                SendOTPService.sendOTP(email, genOTP);
                System.out.println("Enter The OTP: ");
                String otp = sc.nextLine();
                if(otp.equals(genOTP)) {
                    new UserView(email).home();
                } else {
                    System.out.println("Wrong OTP");
                }
            } else {
                System.out.println("User Not Found!");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    private void signUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Email: ");
        String email = sc.nextLine();
        String genOTP = GenerateOTP.getOTP();
        SendOTPService.sendOTP(email, genOTP);
        System.out.println("Enter The OTP: ");
        String otp = sc.nextLine();
        if(otp.equals(genOTP)) {
            User user = new User(name, email);
            int response = UserService.saveUser(user);
            switch (response) {
                case 0:
                    System.out.println("User Registered");
                    break;
                case 1:
                    System.out.println("User Already exists");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else {
            System.out.println("Wrong OTP");
        }
    }


}