package com.example.mathcalc;

import java.util.Arrays;
import java.util.List;

public class CalculateResponseZeroes {

    private String operation;
    private String equation;
    private List<Integer> result;

    @Override
    public String toString() {
        return "CalculateResponse{" +
                "operation='" + operation + '\'' +
                ", equation='" + equation + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public CalculateResponseZeroes(){
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public List<Integer> getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }
}
