package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.print("Please, write your bank system here ->");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch(type){
            case "Visa":
                System.out.println("У вас VISA");
                break;
            case "visa":
                System.out.println("У вас VISA");
                break;
            case "VISA":
                System.out.println("У вас VISA");
                break;
            case "Master card":
                System.out.println("У вас MASTER CARD");
                break;
            case "Master Card":
                System.out.println("У вас MASTER CARD");
                break;
            case "MASTER CARD":
                System.out.println("У вас MASTER CARD");
                break;
            case "master card":
                System.out.println("У вас MASTER CARD");
                break;
            default:
                System.out.println("У вас нал");
	// write your code here
    }
}
}
