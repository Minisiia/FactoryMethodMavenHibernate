package factory_method;

import factory_method.character.impl.Wizard;
import factory_method.character.interfaces.GameCharacter;
import factory_method.character_factory.impl.ArcherFactory;
import factory_method.character_factory.impl.WarriorFactory;
import factory_method.character_factory.impl.WizardFactory;
import factory_method.helper.CharacterHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Suppose you are working on a video game that involves several types of characters, including wizards, warriors, and archers.
 * Each character has a name, a health level, a damage level, and a special ability.
 * The wizards can cast spells, the warriors can block attacks, and the archers can shoot arrows.
 * You have been tasked with implementing a factory method to create these characters.
 * Create a new database using MySQLWorkbench, Maven project and set it up properly,
 * hibernate.cfg.xml settings file, create with using hibernate a new table with initial value.
 */

public class Main {
    public static void main(String[] args) {
        ArcherFactory archerFactory = new ArcherFactory();
        CharacterHelper ch = new CharacterHelper();
        List<Wizard> lc = new ArrayList<>();
        GameCharacter venty = archerFactory.createCharacter("Venty", 20000, 1500);
        GameCharacter ganyu = archerFactory.createCharacter("Ganyu", 25000, 2500);
        GameCharacter tartaglia = archerFactory.createCharacter("Tartaglia", 23000, 2000);
        ch.addCharacter(venty);
        ch.addCharacter(ganyu);
        ch.addCharacter(tartaglia);

        WarriorFactory warriorFactory = new WarriorFactory();
        GameCharacter ayaka = warriorFactory.createCharacter("Ayaka", 18000, 1600);
        GameCharacter ayato = warriorFactory.createCharacter("Ayato", 28000, 2300);
        GameCharacter jean = warriorFactory.createCharacter("Jean", 15000, 1800);
        ch.addCharacter(ayaka);
        ch.addCharacter(ayato);
        ch.addCharacter(jean);

        WizardFactory wizardFactory = new WizardFactory();
        GameCharacter mona = wizardFactory.createCharacter("Mona", 15000, 2300);
        GameCharacter klee = wizardFactory.createCharacter("Klee", 16000, 2800);
        GameCharacter yanfei = wizardFactory.createCharacter("Yanfei", 1800, 2400);
        ch.addCharacter(mona);
        ch.addCharacter(klee);
        ch.addCharacter(yanfei);

        GameCharacter ningguang = wizardFactory.createCharacter("Ningguang", 25000, 2000);
        ch.addCharacter(ningguang);


        lc = ch.getAllWizards();
        for (Wizard temp : lc) {
            System.out.println(temp);
        }

        ch.deleteWizard(4);

        lc = ch.getAllWizards();
        for (Wizard temp : lc) {
            System.out.println(temp);
        }
    }
}
