package com.techken.core;

import com.techken.model.BaseCharacter;
import com.techken.utils.AnsiColors;

import java.util.Scanner;
import java.util.Random;

public class MainLoop {
    
    private final Scanner sc;
    private final MatchManager matchManager;

    public MainLoop() {
        this.sc = new Scanner(System.in);
        this.matchManager = new MatchManager();
    }


public void start() {
    boolean running = true;
    while (running) {
        System.out.println();

        System.out.println(AnsiColors.RED + "  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *" + AnsiColors.RESET);
        System.out.println();
        System.out.println(AnsiColors.BOLD + AnsiColors.RED_BRIGHT + "  ████████╗███████╗ ██████╗██╗  ██╗      ██╗  ██╗███████╗███╗  ██╗"   + AnsiColors.RESET);
        System.out.println(AnsiColors.BOLD + AnsiColors.RED_BRIGHT + "     ██╔══╝██╔════╝██╔════╝██║  ██║      ██║ ██╔╝██╔════╝████╗ ██║"   + AnsiColors.RESET);
        System.out.println(AnsiColors.BOLD + AnsiColors.RED_BRIGHT + "     ██║   █████╗  ██║     ███████║      █████╔╝ █████╗  ██╔██╗██║"   + AnsiColors.RESET);
        System.out.println(AnsiColors.BOLD + AnsiColors.RED_BRIGHT + "     ██║   ██╔══╝  ██║     ██╔══██║      ██╔═██╗ ██╔══╝  ██║╚████║"  + AnsiColors.RESET);
        System.out.println(AnsiColors.BOLD + AnsiColors.RED_BRIGHT + "     ██║   ███████╗╚██████╗██║  ██║      ██║  ██╗███████╗██║ ╚███║"   + AnsiColors.RESET);
        System.out.println(AnsiColors.BOLD + AnsiColors.RED_BRIGHT + "     ╚═╝   ╚══════╝ ╚═════╝╚═╝  ╚═╝      ╚═╝  ╚═╝╚══════╝╚═╝  ╚══╝" + AnsiColors.RESET);
        System.out.println();
        System.out.println(AnsiColors.BOLD + AnsiColors.YELLOW_BRIGHT + "            ░░  S U M B A G A Y   A R E N A  ░░" + AnsiColors.RESET);
        System.out.println();
        System.out.println(AnsiColors.RED + "  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *" + AnsiColors.RESET);
        System.out.println();
        System.out.println(AnsiColors.YELLOW        + "                    ╔═════════════════════╗"  + AnsiColors.RESET);
        System.out.println(AnsiColors.YELLOW        + "                    ║" + AnsiColors.BOLD + AnsiColors.WHITE + "   M A I N  M E N U  " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
        System.out.println(AnsiColors.YELLOW        + "                    ╠═════════════════════╣"  + AnsiColors.RESET);
        System.out.println(AnsiColors.YELLOW        + "                    ║" + AnsiColors.WHITE_DIM  + "  [1]  Start Game    " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
        System.out.println(AnsiColors.YELLOW        + "                    ║" + AnsiColors.WHITE_DIM  + "  [2]  Exit          " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
        System.out.println(AnsiColors.YELLOW        + "                    ╚═════════════════════╝"  + AnsiColors.RESET);
        System.out.println();
        System.out.print(AnsiColors.YELLOW_BRIGHT + "             >> Select Option: " + AnsiColors.RESET);

        String input = sc.nextLine();

        switch (input) {
            case "1":
                initiateFight();
                break;
            case "2":
                running = false;
                System.out.println();
                System.out.println(AnsiColors.RED + "  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  " + AnsiColors.RESET);
                System.out.println(AnsiColors.YELLOW_BRIGHT + "             Exiting Game... Goodbye, Fighter!" + AnsiColors.RESET);
                System.out.println(AnsiColors.RED + "  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  " + AnsiColors.RESET);
                System.out.println();
                break;
            default:
                System.out.println();
                System.out.println(AnsiColors.RED_BRIGHT + "             !! Invalid input. Please try again. !!" + AnsiColors.RESET);
                System.out.println();
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


private BaseCharacter selectCharacter() {
    System.out.println();
    System.out.println(AnsiColors.RED + "  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *" + AnsiColors.RESET);
    System.out.println();
    System.out.println(AnsiColors.BOLD + AnsiColors.YELLOW_BRIGHT + "              ⚔   C H O O S E   Y O U R   F I G H T E R   ⚔" + AnsiColors.RESET);
    System.out.println();
    System.out.println(AnsiColors.RED + "  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *" + AnsiColors.RESET);
    System.out.println();

    // Tekken side
    System.out.println(AnsiColors.YELLOW + "                    ╔═════════════════════════════════╗" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.BOLD + AnsiColors.RED_BRIGHT   + "   ── TEKKEN  ROSTER ──          " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ╠═════════════════════════════════╣" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "  [1]  Heihachi Mishima          " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "         Iron Fist Patriarch     " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "  [2]  Devil Jin                 " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "         Devil Gene Awakened     " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ╠═════════════════════════════════╣" + AnsiColors.RESET);

    // MK side
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.BOLD + AnsiColors.RED_BRIGHT   + "   ── MORTAL KOMBAT ROSTER ──    " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ╠═════════════════════════════════╣" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "  [3]  Johnny Cage               " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "         Hollywood's Finest      " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "  [4]  Reptile                   " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "         Unseen Predator         " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "  [5]  Scorpion                  " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "         Vengeful Specter        " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "  [6]  Liu Kang                  " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ║" + AnsiColors.WHITE_DIM + "         Champion of Earthrealm  " + AnsiColors.RESET + AnsiColors.YELLOW + "║" + AnsiColors.RESET);
    System.out.println(AnsiColors.YELLOW + "                    ╚═════════════════════════════════╝" + AnsiColors.RESET);
    System.out.println();
    System.out.print(AnsiColors.YELLOW_BRIGHT + "             >> Enter Fighter Number: " + AnsiColors.RESET);

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
            System.out.println();
            System.out.println(AnsiColors.RED_BRIGHT + "             !! Invalid selection. Please choose 1-6. !!" + AnsiColors.RESET);
            System.out.println();
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
