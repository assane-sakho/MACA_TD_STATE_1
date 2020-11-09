package client;

import api.appliance.ApplianceBuilder;
import api.appliance.Toaster;

public class App {
    public static void main(String[] args) {
        Toaster toaster = ApplianceBuilder.createToaster();
        System.out.println("L'appareil est initialement dans le comportement : " + toaster.getState());

        toaster.turnOn();
        System.out.println("Évènement allumé : " + toaster.getState());

        toaster.start();
        System.out.println("Évènement démarré : " + toaster.getState());

        toaster.start();
        System.out.println("Évènement démarré (encore une fois) : " + toaster.getState());

        toaster.stop();
        System.out.println("Évènement arrêté : " + toaster.getState());

        toaster.turnOff();
        System.out.println("L'appareil est dans son  état terminal : " + toaster.getState());

        toaster.stop();
        System.out.println("\nÉvènement arrêté à la suite de l'état terminal : " + toaster.getState());

        toaster.start();
        System.out.println("\nÉvènement start à la suite de l'état terminal : " + toaster.getState());

    }
}
