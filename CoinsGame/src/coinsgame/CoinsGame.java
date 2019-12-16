package coinsgame;
/**
 *
 * @author Shahin
 */
public class CoinsGame
{
    public static void main (String[] args)
    {
        for(int count = 1; count < 31; count++)
        {
            System.out.println("Number Of Coins: " + count + ", Winner: " + 
                               Winner(count, "Jack", "Jill"));
        }
    }

    public static String Winner(int coins, String player1, String player2)
    {
        return (Winner(coins, 1) == 1 ? "Jack" : "Jill");
    }

    private static int Winner(int coins, int count)
    {
        int player = count % 2 == 0 ? 2 : 1;

        if(coins == 1 || coins == 2 || coins == 4)
        {
            return player;
        }
        else
        {
            if(coins == 7)
            {
                return Winner(coins - 4, ++count);
            }
            else if(coins == 9 || coins == 6)
            {
                return Winner(coins - 1, ++count);
            }
            else if(coins == 8 || coins == 5 || coins == 3)
            {
                return Winner(coins - 2, ++count);
            }
            else
            {
                int random = (int) (Math.random() * 8) + 11;

                if(random % 4 == 0)
                {
                    return Winner(coins - 4, ++count);
                }
                else if(random % 2 == 1)
                {
                    return Winner(coins - 1, ++count);
                }
                else 
                {
                    return Winner(coins - 2, ++count);
                }
            }
        }
    }
}