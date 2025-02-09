package com.example.memecointracker;

public class Coin {
    private String name;
    private String symbol;
    private double currentPrice;
    private double marketCap;
    private double priceChange24h;

    // Constructor, Getters, and Setters
    public Coin(String name, String symbol, double currentPrice, double marketCap, double priceChange24h) {
        this.name = name;
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.marketCap = marketCap;
        this.priceChange24h = priceChange24h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getPriceChange24h() {
        return priceChange24h;
    }

    public void setPriceChange24h(double priceChange24h) {
        this.priceChange24h = priceChange24h;
    }
}