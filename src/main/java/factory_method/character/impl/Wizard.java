package factory_method.character.impl;

import factory_method.character.interfaces.GameCharacter;

import javax.persistence.*;

@Entity

public class Wizard implements GameCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int hp;
    @Column
    private int damage;
    @Column
    private String ability;

    public Wizard() {
    }

    public Wizard(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        ability = " casts spells!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + ability);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", ability='" + ability + '\'' +
                '}';
    }
}
