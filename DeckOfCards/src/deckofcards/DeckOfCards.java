/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

/**
 *
 * @author Shahin
 */
public class DeckOfCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] deck = ReadDeck();
        
        String [] suits = {"SPADES", "CLUBS", "Diamonds", "HEARTS"};    
        String [] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                           "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        
        System.out.println("Deck Of Cards: \n");
        
        /**
         * @Outputs 
         */
        for(int index = 0; index < deck.length; index++)
        {
            System.out.printf("%-5s of %-6s\n", ranks[deck[index] % 13], 
                                                suits[deck[index] / 13]);
        }
        
        for(int index = 0; index < deck.length; index++)
        {
            int rand = (int) (Math.random() * deck.length);
            int temp = deck[index];
            deck[index] = deck[rand];
            deck[rand]  = temp;
        }
        
        System.out.println("\nDeck Of Cards Shuffled: \n");
        
        /**
         * @Outputs 
         */
        for(int index = 0; index < deck.length; index++)
        {
            System.out.printf("%-5s of %-6s\n", ranks[deck[index] % 13], 
                                                suits[deck[index] / 13]);
        }
        
        
    }
    
    /**
     * 
     * @return 
     */
    public static int[] ReadDeck()
    {
        int[] deck = new int[52];
        
        for(int index = 0; index < deck.length; index++)
        {
            deck[index] = index;
        }
        return deck;
    }
}
    

