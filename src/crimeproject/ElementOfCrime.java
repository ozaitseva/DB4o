/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimeproject;

/**
 *
 * @author Ольга
 */
public class ElementOfCrime {
    private String number, text;
    
    public ElementOfCrime(String text, String number){
        this.number = number;
        this.text = text;
    }
    
    public ElementOfCrime(){}
    
    public String toString(){
        return("  Article: " + number + "\n" + "  text: " + text + ";\n");
    }
    public String getNumber(){
        return number;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public String getText(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
}
