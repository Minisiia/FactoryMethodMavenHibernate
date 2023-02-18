package factory_method.character_factory.impl;

import factory_method.character.impl.Wizard;
import factory_method.character_factory.abstracts.AbsCharacterFactory;

public class WizardFactory extends AbsCharacterFactory {
    @Override
    public Wizard createCharacter(String name, int hp, int damage) {
       return new Wizard(name, hp, damage);
    }
}
