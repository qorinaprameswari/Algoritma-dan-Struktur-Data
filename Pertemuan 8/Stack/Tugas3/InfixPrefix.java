/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Prameswari
 */
public class InfixPrefix {
    int n;
    int top;
    char stack[];
    
    public InfixPrefix(int total){
        n = total;
        top = -1;
        stack = new char[n];
    }
    public void push(char operator){
        top++;
        stack[top] = operator;
    }
    public char pop(){
        char operator = stack[top];
        top--;
        return operator;
    }
    public boolean IsOperand(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <='z') || (c >= '0' && c <= '9') || c == ' ' || c == '.'){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsOperator(char c){
        if(c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+'){
            return true;
        }else{
            return false;
        }
    }
    public int presedence(char c){
        switch (c){
            case '^' : return 3;
            case '%' : return 2;
            case '/' : return 2;
            case '*' : return 2;
            case '-' : return 1;
            case '+' : return 1;
            default : return 0;
        }
    }
    public String konversi(String infix){
        String prefix = "";
        char c;
        for(int i =0;i<infix.length();i++){
            c = infix.charAt(i);
            if(IsOperand(c)){
                prefix = prefix + c;
            }
            else if (c == '('){
                push(c);
            }
            else if(IsOperator(c)){
                if(top == -1){
                    push(c);
                }else{
                    while (top > -1 && presedence(stack[top]) > presedence(c)){
                    prefix = prefix + pop();
                    }
                    push(c);
                }
            }
            else if (c == ')'){
                while (stack[top] != '('){
                    prefix = prefix+ pop();
                }
                pop();
            }            
        }
        while(top >= 0){
            prefix = prefix + pop();
        }
        return prefix;
    }
    String balik(String infix){
        String balik = "";
        for(int i=infix.length()-1;i>=0;i--){
            char c = infix.charAt(i);
            if(c == '(')
                c = ')';
            else if(c == ')')
                c = '(';
            balik = balik + c;
        }
        return balik;
    }
}
