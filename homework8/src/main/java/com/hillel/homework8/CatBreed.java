package com.hillel.homework8;

public class CatBreed {
    String colourEyes;
    String breed;

    public CatBreed(String colourEyes, String breed) {
        this.colourEyes = colourEyes;
        this.breed = breed;
    }

    public String printBreedCharacteristics() {
        return " колір очей " + colourEyes + ", порода " + breed;

    }
}
