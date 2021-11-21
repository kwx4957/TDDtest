package com.test.intellij;

public class Shape {
    private final int nunmberOfsides;

    public Shape(int nunmberOfsides) {
        if (nunmberOfsides < 3 || nunmberOfsides == Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        this.nunmberOfsides = nunmberOfsides;
    }

    public int getNunmberOfsides() {
        return nunmberOfsides;
    }

    public String description(){
        return "Square";
    }
}
