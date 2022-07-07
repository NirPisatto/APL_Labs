package com.calculator.model;

public class MainViewModel {
    private int currentPage;

    public MainViewModel(){
        this.currentPage = 0;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
