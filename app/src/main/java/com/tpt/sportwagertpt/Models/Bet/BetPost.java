package com.tpt.sportwagertpt.Models.Bet;

public class BetPost {
    public String sport_category;
    public int amount_of_bets;
    public double multiplicator;
    public BetTypes bet_type;
    public MatchInfo match_info;

    public BetPost() {
    }

    public String getSport_category() {
        return sport_category;
    }

    public void setSport_category(String sport_category) {
        this.sport_category = sport_category;
    }

    public int getAmount_of_bets() {
        return amount_of_bets;
    }

    public void setAmount_of_bets(int amount_of_bets) {
        this.amount_of_bets = amount_of_bets;
    }

    public double getMultiplicator() {
        return multiplicator;
    }

    public void setMultiplicator(double multiplicator) {
        this.multiplicator = multiplicator;
    }

    public BetTypes getBet_type() {
        return bet_type;
    }

    public void setBet_type(BetTypes bet_type) {
        this.bet_type = bet_type;
    }

    public MatchInfo getMatch_info() {
        return match_info;
    }

    public void setMatch_info(MatchInfo match_info) {
        this.match_info = match_info;
    }
}
