package factory_method.character_factory.impl;

import factory_method.character.impl.Archer;
import factory_method.character_factory.abstracts.AbsCharacterFactory;

public class ArcherFactory extends AbsCharacterFactory {

    @Override
    public Archer createCharacter(String name, int hp, int damage) {
        return new Archer(name, hp, damage);
    }
}
