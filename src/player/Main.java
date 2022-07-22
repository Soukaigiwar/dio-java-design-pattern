package player;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AttackMode machineGun = new Machinegun();
        AttackMode rayBeam = new RayBeam();
        AttackMode atomicBomb = new AtomicBomb();
        SpaceCraft ragnarok = new SpaceCraft("Player1");
        Scanner input = new Scanner(System.in);
        String choice;

        System.out.println(ragnarok.getPlayerName());
        ragnarok.setAttackMode(machineGun);

        ragnarok.mode();
        ragnarok.mode();

        ragnarok.setAttackMode(rayBeam);

        ragnarok.mode();

        ragnarok.setAttackMode(atomicBomb);

        System.out.print("Do you like to use Atomic Bomb?\nyes or no: ");
        choice = input.next().toLowerCase();
        if (choice.equals("yes"));
        else {
            ragnarok.setAttackMode(machineGun);
        }

        ragnarok.mode();

        Ragnarok asciiImage = new Ragnarok();
        asciiImage.print();
    }
}
