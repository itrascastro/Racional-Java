/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

/**
 *
 * @author itrascastro
 * 
 * We make final Racional to avoid calling overridable methods in the constructor
 * http://stackoverflow.com/questions/3404301/whats-wrong-with-overridable-method-calls-in-constructors
 */
public final class Racional {
    
    private int numerador;
    private int denominador;
    private static int contadorRacionales = 0;
    
    public Racional() {
        this.numerador = 0;
        this.denominador = 0;
        Racional.contadorRacionales++;
    }

    public Racional(int numerador, int denominador) throws Exception {
        this.setNumerador(numerador);
        try {
            this.setDenominador(denominador);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        Racional.contadorRacionales++;
    }

    public static int getContadorRacionales() {
        return Racional.contadorRacionales;
    }
    
    /**
     * Get the value of denominador
     *
     * @return the value of denominador
     */
    public int getDenominador() {
        return this.denominador;
    }

    /**
     * Set the value of denominador
     *
     * @param denominador new value of denominador
     * @throws java.lang.Exception
     */
    public void setDenominador(int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("ERROR denominador cero");
        }
        this.denominador = denominador;
    }

    /**
     * Get the value of numerador
     *
     * @return the value of numerador
     */
    public int getNumerador() {
        return this.numerador;
    }

    /**
     * Set the value of numerador
     *
     * @param numerador new value of numerador
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return "Racional{" + "numerador=" + this.numerador + ", denominador=" + this.denominador + '}';
    }

    /**
     * 
     * @param r Racional
     * @return boolean
     */
    public boolean igual(Racional r) {
        return this.getNumerador() == r.getNumerador() && this.getDenominador() == r.getDenominador();
    }
    
    /**
     * 
     * @param r Racional
     * @return Racional
     */
    public Racional producto(Racional r) throws Exception {
        Racional result;
        
        try {
            result = new Racional(this.getNumerador() * r.getNumerador(), this.getDenominador() * r.getDenominador());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return result;
    }
    
    public static Racional producto(Racional r1, Racional r2) throws Exception {
        Racional result;
        
        try {
            result = new Racional(r1.getNumerador() * r2.getNumerador(), r1.getDenominador() * r2.getDenominador());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        
        return result;
    }
    
    public void escalar(int n) throws Exception {
        this.setNumerador(this.numerador * n);
        try {
            this.setDenominador(this.denominador * n);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

