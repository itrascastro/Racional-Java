/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

/**
 *
 * @author itrascastro
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Racional r1, r2, res;
        
        try {
            r1 = new Racional(3, 2);
            r2 = new Racional(2,3);
            
            res = r1.producto(r2);
            
            System.out.println(res);
            
            r2 = r1;
            r1 = null;
            System.out.println(r1);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
