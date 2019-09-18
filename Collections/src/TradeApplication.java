import com.learning.inheritance.Fund;
import com.learning.inheritance.FxTrade;
import com.learning.inheritance.Trade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TradeApplication {

    public static void main(String[] args) {

        // 1st Object
        Fund fund = new Fund();
        fund.setFundName("ABC Fund");
        fund.setFundNumber(123);

        Trade t = new FxTrade();

        t.setFund(fund);
        t.setTradeAmount(120.12);
        t.setNoOfFunds(1);
        t.setTradeId(1234);
        t.setTraderName("Trader");
        // t.setCurrency("EURO"); --> this will not work. Why?
        // So use parameterized constructor
        t.showTradeDetails();

        // 2nd Object
        Fund _fund = new Fund();
        _fund.setFundName("ABC Fund with Underscore");
        _fund.setFundNumber(345);

        Trade _t = new FxTrade("EURO");

        _t.setFund(_fund);
        _t.setTradeAmount(130.12);
        _t.setNoOfFunds(1);
        _t.setTradeId(1234);
        _t.setTraderName("Trader _");
        _t.showTradeDetails();

        // 3rd Object
        Fund fund1 = new Fund();
        fund1.setFundName("ABC Fund with Number 1");
        fund1.setFundNumber(567);

        Trade t1 = new FxTrade(12345, "Trader 1", 140.12, 1, "EURO");

        t1.setFund(fund1);

        t1.showTradeDetails();

        List<Trade> tradeList = new ArrayList<>();
        tradeList.add(t);
        tradeList.add(t1);
        tradeList.add(_t);

        // Trade List is ready, Lets iterate!

        // Iterate using iterator
        System.out.println("Iterating using iterator...");
        Iterator itr = tradeList.iterator(); // iterating
        while (itr.hasNext()) {
            // Object obj = itr.next();
            // obj. --> You wont get Trade methods unless you cast it
            Trade tradeObj = (Trade) itr.next(); // This is called casting when you use () in front
            tradeObj.showTradeDetails();
            System.out.println(tradeObj.toString());
        }

        // Iterate using for loop
        System.out.println("Iterating using for loop...");
        for (Trade trade : tradeList) {
            trade.showTradeDetails();
            System.out.println(trade.toString());
        }
    }
}
