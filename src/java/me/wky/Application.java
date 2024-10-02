package src.java.me.wky;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de vitórias:");
        int wins = scanner.nextInt();
        System.out.println("Informe a quantidade de derrotas:");
        int loses = scanner.nextInt();

        Hero hero = new Hero();
        hero.calculateRank(wins,loses);
        System.out.println(hero.heroToString());
    }
}
