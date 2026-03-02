package com.techken.core;

import com.techken.model.BaseCharacter;
import java.util.Scanner;
import java.util.Random;

public class MainLoop {
    
    private final Scanner sc;
    private final MatchManager matchManager;

    public MainLoop() {
        this.sc = new Scanner(System.in);
        this.matchManager = new MatchManager();
    }


    // TODO : E IMPROVE ANG MENU // SKELETAL LNG NI FOR NOW
    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\n========================================");
            System.out.println("     TECH-KEN : SUMBAGAY ARENA");
            System.out.println("========================================");
            System.out.println("[1] Start Game");
            System.out.println("[2] Exit");
            System.out.print("Select Option: ");

            String input = sc.nextLine();

            switch (input) {
                case "1":
                    initiateFight();
                    break;
                case "2":
                    running = false;
                    System.out.println("Exiting Game... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    private void initiateFight() {
        System.out.println("\n--- Player 1 Character Selection ---");
        BaseCharacter player1 = selectCharacter();

        if (player1 == null) {
            System.out.println("Gi implement pa ni lol. Returning to main menu.");
            return;
        }

        System.out.println("\n--- CPU Character Selection ---");
        BaseCharacter player2 = selectCpuCharacter();
        
        System.out.println("\nInitializing Fight...");
        matchManager.startMatch(player1, player2);
    }


    // IDEA: ADD COLORS SA CHARACTERS , AND MAYBE INFO?
    private BaseCharacter selectCharacter() {
        System.out.println("Choose your fighter:");
        System.out.println("1. Heihachi Mishima");
        System.out.println("2. Devil Jin");
        System.out.println("3. Johnny Cage");
        System.out.println("4. Reptile");
        System.out.println("5. Scorpion");
        System.out.println("6. Liu Kang");
        System.out.print("Enter number: ");

        String choice = sc.nextLine();

        // TODO: Diri e instantiate ang specific classes from Member 3 & 4 (Character classes) here
        switch (choice) {
            case "1": return null; // return new HeihachiMishima();
            case "2": return null; // return new DevilJin();
            case "3": return null; // return new JohnnyCage();
            case "4": return null; // return new Reptile();
            case "5": return null; // return new Scorpion();
            case "6": return null; // return new LiuKang();
            default:
                System.out.println("Invalid selection.");
                return null;
        }
    }

    private BaseCharacter selectCpuCharacter() {
        Random random = new Random();
        int pick = random.nextInt(6) + 1;
        System.out.print("CPU selected: ");
        
        // TODO: Instantiate specific classes for CPU
        switch (pick) {
            case 1: System.out.println("Heihachi Mishima"); break;
            case 2: System.out.println("Devil Jin"); break;
            case 3: System.out.println("Johnny Cage"); break;
            case 4: System.out.println("Reptile"); break;
            case 5: System.out.println("Scorpion"); break;
            case 6: System.out.println("Liu Kang"); break;
        }
        
        // Null for now until classes are available
        /* 
        if (pick == 1) return new HeihachiMishima();
        */
        return null;
    }
}
