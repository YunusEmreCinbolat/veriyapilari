/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texteditos;

/**
 *
 * @author user
 */
public class Dugum {
    int index;
    String kelime;

    public Dugum(int index, String s) {
        this.index = index;
        this.kelime = s;
    }
    public String toString(){
        return index+ "-"+kelime; 
    }
}
