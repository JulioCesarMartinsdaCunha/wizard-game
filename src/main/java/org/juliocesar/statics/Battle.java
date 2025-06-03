package org.juliocesar.statics;

import org.juliocesar.entities.Enemy;
import org.juliocesar.entities.Character;

public class Battle
{
    Character playerChar = null;
    Enemy playerInimigo = null;

    boolean playerVence = false;

    public Battle(Character character, Enemy inimigo, boolean playerWins)
    {
        this.playerChar = character;
        this.playerInimigo = inimigo;
        this.playerVence = playerWins;
    }

    public boolean isPlayerWins()
    {
        return playerVence;
    }

    public Character getCharacter()
    {
        return playerChar;
    }

    public Enemy getEnemy()
    {
        return playerInimigo;
    }
}
