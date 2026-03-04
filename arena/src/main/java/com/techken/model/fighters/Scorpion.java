package com.techken.model.fighters;

public class Scorpion extends Fighter {
    public Scorpion() {
        super("Scorpion", 100, 55, 7);

        //offensive burst
        //this.skills[0] = new AttackAction("Spear - Get Over Here!", 30);
        //this.skills[1] = new AttackAction("Hellfire", 28);
        //this.skills[2] = new AttackAction("Teleport Punch", 26);
    }

    @Override
    public void specialMove(Fighter opponent) {
        System.out.println("Scorpion unleashes Hellfire!");
        opponent.takeDamage(30);
    }
}

