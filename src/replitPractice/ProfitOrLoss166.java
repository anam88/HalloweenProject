package replitPractice;

public class ProfitOrLoss166 {
    public String c_profits(int buyPrice,int sellPrice)
    {
        //your code here
        String result = (buyPrice > sellPrice) ? "profits" : (buyPrice < sellPrice) ? "loss" :
                "no loss";
        System.out.println(result);
        return result;

    }
}
