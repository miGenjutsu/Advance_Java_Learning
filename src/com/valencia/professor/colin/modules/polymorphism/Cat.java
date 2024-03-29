package com.valencia.professor.colin.modules.polymorphism;

public class Cat extends Animal {
    private String name;
    private String furColor;

    public Cat(double weight, String name, String furColor) {
        super(weight);
        this.name = name;
        this.furColor = furColor;
    }

    public void setName(String name) { this.name = name; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    public String getName() { return name; }
    public String getFurColor() { return furColor; }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)) {
            return false;
        }

        boolean results=false;

        if (getWeight() == ((Cat) obj).getWeight()) {
            results=true;
        }

        return results;

    }

    public String toString() {
        String result;
        result="I'm a cat Named: "+name+" "+
                "with a fur color of: "+furColor+" and "+
                super.toString();
        return result;
    }
}