/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nitro V
 */

public class CurrencyMath {

    // 1. Attributes (OOP Concept)
    private double conversionRate;
    private String[] history; // Array Requirement
    private int historyCount;
    
    //like ang price sa dollar naa dire
    //mura syag listahan nga naay mga slots dire ting 100 pesos converted to ana ana
    //history count dire ting tig ihap pila na kabuok ang sulod sa history

    // 2. Constructor (OOP Concept)
    public CurrencyMath(double rate) {
        this.conversionRate = rate;
        this.history = new String[5]; // Store last 5 transactions
        this.historyCount = 0;
        
        //dire gi set uo ang tanan
        // pag ingon nato og new string nag reserve tag 5 ka slots para sa history
    }

    // 3. Methods for Calculation (Methods Requirement)
    public double convertToDollar(double peso) {
        return peso / conversionRate;
    }

    public double convertToPeso(double dollar) {
        return dollar * conversionRate;
    }
    
    //one divides the other multiplies
    //mao dire ang math
    // kung peso to dollar divide
    //kung dollar to peso multiply
    //kay diba gi set man to natog 58.00 pesos per dollar
   

    // 4. Array and Loop Logic (Technical Requirement)
    public void addToHistory(String record) {
        // If array is full, shift elements to make room (Logic/Loop)
        if (historyCount == history.length) {
            for (int i = 0; i < history.length - 1; i++) {
                history[i] = history[i+1];
            }
            history[history.length - 1] = record;
        } else {
            history[historyCount] = record;
            historyCount++;
        }
    }
    
    //code ni sya na if naay madungag gani murag mo balhin 
    //ang pinaka bag-o ma ilisan ang pinaka daan

    public String getHistoryAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Recent Conversions ---\n");
        // Loop to read array
        for (int i = 0; i < historyCount; i++) {
            sb.append(history[i]).append("\n");
        }
        return sb.toString();
    }
    
    // naghimo tag loop para tapukon ang tanan sulod sa array
    // og himooon silang usa ka taas nga sentence
    //mao nang string builder
}
    
