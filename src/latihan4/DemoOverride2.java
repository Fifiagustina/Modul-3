/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Fifi Agustina
 */
class DemoOverride2 {
 public static void main (String [] args)
 {
     B obj = new B ();
     obj.setA(50);
     obj.setB(150);
     obj.setC(60);
     //akan memanggil method yang terdapat pada kelas B
     obj.tampilkanNilai();
     obj.tampilkanNilaiC();
 }
}
