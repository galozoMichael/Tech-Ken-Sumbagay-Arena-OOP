package com.techken.model.fighters;

public class LiuKang extends Fighter {
    public LiuKang() {
        super("Liu Kang", 110, 45, 12);

        //Balanced?
        //this.skills[0] = new AttackAction("Flying Kick", 24);
        //this.skills[1] = new AttackAction("Dragon Fireball", 22);
        //this.skills[2] = new AttackAction("Bicycle Kick", 26);
    }

    @Override
    public void specialMove(Fighter opponent) {
        System.out.println("Liu Kang performs Bicycle Kick!");
        opponent.takeDamage(26);
    }
}

