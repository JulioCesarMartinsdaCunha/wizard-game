package org.juliocesar;

import org.juliocesar.entities.Character;
import org.juliocesar.statics.Battle;

import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    String name = "";
    int batalhasVencidas = 0;
    int batalhasPerdidas = 0;
    int totalBatalhas = 0;

    ArrayList<Character> listaPersonagens = new ArrayList<Character>();
    Character characterAtual = null;

    ArrayList<Battle> listaBatalhas = new ArrayList<Battle>();

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
        if(!listaBatalhas.contains(newBattle))
        {
            listaBatalhas.add(newBattle);
        }
    }

    public void RemoveBattle(int index)
    {
        listaBatalhas.remove(index);
    }

    public void RemoveBattle(Battle battle)
    {
        listaBatalhas.remove(battle);
    }

    public void PrintAllBattles()
    {

    }

    /// GETTERS&SETTERS

    public void setCurrentPerson(Character person)
    {
        characterAtual = person;
        if(!listaPersonagens.contains(person))
        {
            listaPersonagens.add(person);
        }
    }

    public Battle getBattle(int index)
    {
        return listaBatalhas.get(index);
    }

    public String getName()
    {
        return name;
    }

    public Object[] getPersons()
    {
        return listaPersonagens.toArray();
    }

    public Character getCurrentPerson()
    {
        return characterAtual;
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
