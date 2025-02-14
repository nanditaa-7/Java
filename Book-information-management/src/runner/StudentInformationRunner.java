package runner;

import things.StudentInformation;

import java.util.Scanner;

public class StudentInformationRunner {
    public static void main(String[]args){
        StudentInformation studentInformation=new StudentInformation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String studentname=scanner.nextLine();
        System.out.println("Student Name Is:");
    }
}
