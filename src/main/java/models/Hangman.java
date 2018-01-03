package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by Guest on 1/3/18.
 */
public class Hangman {

    private String secretWord;
    private int steps;//number of opportunities for a player
    private List<String> guessWord;

    public Hangman(String secretWord, int steps ){
        this.steps = steps;
        this.secretWord = secretWord;
        this.guessWord = new ArrayList<String>();
        for (int i = 0; i< secretWord.length(); i++){
            guessWord.add("_");
        }
    }


    public int checkWord(String word){
        if(word.matches("[a-z]")){
            return word.length();
        }
        else
            return -1;
    }

    public List<Integer> indexMatches(char character){
        int count = 0;
        List<Integer> indexs = new ArrayList<Integer>();
        char[] secretWordArray = secretWord.toCharArray();
        for(int i = 0; i<secretWordArray.length; i++){
           if(secretWordArray[i] == character){
               indexs.add(i);
           }
        }
        return indexs;
    }

    public void updateGuessWord(List<Integer> indexs, char character){
        if(indexs.size()>0){
            for (int index : indexs){
                this.guessWord.set(index, Character.toString(character));
            }
        }
    }

    public boolean isWinner(){
        if(guessWord.contains("_")){
            return false;
        }
        else return true;
    }
    public boolean isLosser(){
        if(this.steps ==0){
            return true;
        }
        else
            return false;
    }


    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public  List<String> getGuessWord() {
        return guessWord;
    }

    public int getSteps() {
        return steps;
    }

    public String getSecretWord() {
        return secretWord;
    }
}
