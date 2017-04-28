/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2ireader;

/**
 *
 * @author ADMIN
 */
public class D2iReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reader a = new Reader("E:\\Escritorio\\editar\\datos.d2i") {};
//        a._aLang.entrySet().stream().forEach((entry) -> {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });

        System.out.println("*****************Langs Party*************************\n");

        int i = 1;
        while (a.getText(i) != null) {
            System.out.println(i+" "+a.getText(i));
            i++;
        }
        
//        int i = 1;
//        while (a.getText(i) != null) {
//            System.out.println(i+" "+a.getText(i));
//            i++;
//        }
    }
    
}
