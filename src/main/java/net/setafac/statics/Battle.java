package net.setafac.statics;

import net.setafac.entities.Enemy;
import net.setafac.entities.Character;

public class Battle
{
    Character charPlayer = null;
    Enemy enemyPlayer = null;

    boolean isPlayerWins = false;

    public Battle(Character character, Enemy inimigo, boolean playerWins)
    {
        this.charPlayer = character;
        this.enemyPlayer = inimigo;
        this.isPlayerWins = playerWins;
    }

    /// SETTERS&GETTERS
    public boolean isPlayerWins()
    {
        return isPlayerWins;
    }

    public Character getCharacter()
    {
        return charPlayer;
    }

    public Enemy getEnemy()
    {
        return enemyPlayer;
    }
}
