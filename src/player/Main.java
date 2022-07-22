package player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AttackMode machineGun = new Machinegun();
        AttackMode rayBeam = new RayBeam();
        AttackMode atomicBomb = new AtomicBomb();
        SpaceCraft ragnarock = new SpaceCraft("Player1");
        Scanner input = new Scanner(System.in);
        String choice;

        System.out.println(ragnarock.getPlayerName());
        ragnarock.setAttackMode(machineGun);

        ragnarock.mode();
        ragnarock.mode();

        ragnarock.setAttackMode(rayBeam);

        ragnarock.mode();

        ragnarock.setAttackMode(atomicBomb);

        System.out.print("Do you like to use Atomic Bomb?\nyes or no: ");
        choice = input.next().toLowerCase();
        if (choice.equals("yes"));
        else {
            ragnarock.setAttackMode(machineGun);
        }

        ragnarock.mode();
    }
}
