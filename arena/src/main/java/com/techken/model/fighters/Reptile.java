package com.techken.model.fighters;

public class Reptile extends Fighter {
    public Reptile() {
        super("Reptile", 95, 40, 11);

        //this.skills[0] = new AttackAction("Acid Spit", 20);
        //this.skills[1] = new AttackAction("Poison Cloud", 15);
        //this.skills[2] = new AttackAction("Life Drain", 25);
    }

    @Override
    public void specialMove(Fighter opponent) {
        System.out.println("Reptile uses Life Drain!");
        opponent.takeDamage(25);
        this.health += 12; // heal half of damage
        System.out.println("Reptile heals for 12 HP!");
    }
}


