package factory_method.character.impl;

import factory_method.character.interfaces.GameCharacter;

import javax.persistence.*;

@Entity
public class Archer implements GameCharacter {
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

    public Archer() {
    }

    public Archer(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        ability = " shoots arrows!";
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public void specialAbility() {
        System.out.println(name + ability);
    }

    @Override
    public String toString() {
        return "Archer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", ability='" + ability + '\'' +
                '}';
    }
}
