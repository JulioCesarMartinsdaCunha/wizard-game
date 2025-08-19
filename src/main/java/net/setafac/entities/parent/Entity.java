package net.setafac.entities.parent;

import net.setafac.enuns.EntityRax;

public abstract class Entity
{
    protected String name = "";
    protected EntityRax race;

    protected int maxLife = 0;
    protected int life = 0;

    protected int maxMana = 0;
    protected int mana = 0;

    protected boolean isDamaged = false;

    public void TakeDamage(int amount)
    {
        life = Math.max(life - amount, 0);
        isDamaged = true;
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getLife() {
        return life;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getMana() {
        return mana;
    }

    public boolean isDamaged() {
        return isDamaged;
    }
}
