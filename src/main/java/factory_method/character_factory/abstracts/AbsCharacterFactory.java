package factory_method.character_factory.abstracts;

import factory_method.character.interfaces.GameCharacter;

public abstract class AbsCharacterFactory {

    public GameCharacter createCharacter(String name, int hp, int damage) {
        return null;
    }
}
