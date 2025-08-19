package net.setafac.entities;

import net.setafac.data.Player;
import net.setafac.entities.parent.Entity;
import net.setafac.enuns.EntityRax;

public class Character extends Entity
{
    public Character(Player player, EntityRax race)
    {
        name = player.getName();

        maxLife = 100;
        maxMana = 100;

        this.race = race;
    }

    @Override
    public void TakeDamage(int amount)
    {
        super.TakeDamage(amount);
    }
}
