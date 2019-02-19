package com.example.mathcalc;

public class CalculateResponse {

    private String operation;
    private String equation;
    private String result;

    @Override
    public String toString() {
        return "CalculateResponse{" +
                "operation='" + operation + '\'' +
                ", equation='" + equation + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

    public CalculateResponse(){
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
