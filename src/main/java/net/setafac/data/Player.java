package net.setafac.data;

import net.setafac.entities.Character;
import net.setafac.statics.Battle;

import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    String name = "";

    int batalhasVencidas = 0;
    int batalhasPerdidas = 0;
    int totalBatalhas = 0;

    ArrayList<Character> characterList = new ArrayList<Character>();
    Character currentCharacter = null;

    ArrayList<Battle> battlesList = new ArrayList<Battle>();

    public Player()
    {

    }

    /// METHODS
    private void Registry()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("---Registrar jogador------------------------------------\n");
        System.out.print("Digite seu nome: ");
        name = scan.nextLine();

        System.out.println();
        System.out.println("-----------------------------------------------------------\n\n");

        scan.close();
    }

    public void AddBattles(Battle newBattle)
    {
        if(!battlesList.contains(newBattle))
        {
            battlesList.add(newBattle);
        }
    }

    public void RemoveBattle(int index)
    {
        battlesList.remove(index);
    }

    public void RemoveBattle(Battle battle)
    {
        battlesList.remove(battle);
    }

    public void PrintAllBattles()
    {

    }

    /// GETTERS&SETTERS

    public void setCurrentPerson(Character person)
    {
        currentCharacter = person;
        if(!characterList.contains(person))
        {
            characterList.add(person);
        }
    }

    public Battle getBattle(int index)
    {
        return battlesList.get(index);
    }

    public String getName()
    {
        return name;
    }

    public Object[] getPersons()
    {
        return characterList.toArray();
    }

    public Character getCurrentPerson()
    {
        return currentCharacter;
    }

    public int countWins()
    {
        return batalhasVencidas;
    }

    public int countLoses()
    {
        return batalhasPerdidas;
    }

    public int countBattles()
    {
        return totalBatalhas;
    }
}
