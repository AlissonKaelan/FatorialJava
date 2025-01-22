/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Alisson Kaelan
 */
    public class Fatorial {
    /*
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor(int n){
        numero = n;
        int f = 1;
        String soma = "";
        for(int c = n; c > 1; c--){
            f += c;
            soma += c + " x ";
        }
        soma += "1 = ";
        fatorial = f;
        formula = soma;
   }
     public int getFatorial(){
        return fatorial;
    }
     public String getFormula(){
        return formula;
    }
     */
     private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    public void setValor(int n) {
        numero = n;
        fatorial = 1; // Reinicializa o fatorial
        StringBuilder soma = new StringBuilder(); // Usar StringBuilder para melhor performance
        for (int c = n; c > 1; c--) {
            fatorial *= c; // Multiplica para calcular o fatorial
            soma.append(c).append(" x "); // Constrói a fórmula
        }
        soma.append("1 = "); // Adiciona o último termo
        formula = soma.toString(); // Concatena a fórmula com o resultado
    }
    
    public int getFatorial() {
        return fatorial;
    }
    
    public String getFormula() {
        return formula;
    }
    
}
