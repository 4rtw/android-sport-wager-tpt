package com.tpt.sportwagertpt.Models.Bet;

import java.util.Date;

public class Bet {
    public String id;
    public long client_id;
    public MatchInfo match_info;
    public String sport_category;
    public int amount_of_bets;
    public double multiplicator;
    public Date creation_date;
    public boolean collected;
    public BetTypes bet_type;

    public Bet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    public MatchInfo getMatch_info() {
        return match_info;
    }

    public void setMatch_info(MatchInfo match_info) {
        this.match_info = match_info;
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

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public boolean isCollected() {
        return collected;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public BetTypes getBet_type() {
        return bet_type;
    }

    public void setBet_type(BetTypes bet_type) {
        this.bet_type = bet_type;
    }
}
