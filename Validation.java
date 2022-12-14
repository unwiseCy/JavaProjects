import javax.swing.JOptionPane;

public class Validation {
    
    public static int validBet(int gameName, int betAmount) {
        //validate bet amount
        if (gameName == 1)
        {
            while (betAmount < 50 || betAmount > 500)
            {
                betAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "ERROR: BET MUST BE BETWEEN $50-500. \nHow much would you like to bet?"));
            }
        }
        else if (gameName == 2)
        {
            while (betAmount < 10 || betAmount > 100)
            {
                betAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "ERROR: BET MUST BE BETWEEN $10-100. \nHow much would you like to bet?"));
            }
        }
        return betAmount;
    }
}
