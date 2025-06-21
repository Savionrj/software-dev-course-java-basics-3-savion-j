package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        return x < 5;
    }

    public String getAgeGroup(int age) {
        if(age>=20){
            return "adult";
        }
        else if(age >= 13){
            return "teen";
        }
        else{
            return "child";
        }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)
        if(passwordLength < 8){
            return false;
        }
        else{
            return true;
        }
    }
}
