public class BestTimeToBuyandSell {
    public static void main(String[] args) {
        int [] prices ={7,1,5,3,6,4};

        System.out.println("Brute approach ");
        int profit = bruteBuySell(prices);
        System.out.println("Max Profit "+ profit);

        System.out.println("Better approach ");
        int profit1 = betterBuySell(prices);
        System.out.println("Max Profit "+ profit1);
    }

    // Time Complexity : O(n*n)
    // Space Complexity : O(1)
    private static  int bruteBuySell(int [] prices){
        int profit =0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                    profit= Math.max(profit,prices[j]-prices[i]);
            }
        }


        return profit;
    }



    // Time Complexity : O(n)
    //Space Complexity : O(1)
    private static  int betterBuySell(int [] prices){
        int profit=0;
        int buy = prices[0];
        int sell =0;

        for(int i=1;i<prices.length;i++){

            if(prices[i]<buy) buy=prices[i];
            else{
                sell = prices[i];
                profit = Math.max(profit,sell-buy);
            }

        }

        return  profit;
    }
}
