package factory_method.character_factory.impl;

import factory_method.character.impl.Warrior;
import factory_method.character_factory.abstracts.AbsCharacterFactory;

public class WarriorFactory extends AbsCharacterFactory {
    @Override
    public Warrior createCharacter(String name, int hp, int damage) {
        return new Warrior(name, hp, damage);
    }
}
