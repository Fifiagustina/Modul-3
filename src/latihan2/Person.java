/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Fifi Agustina
 */
class Person 
{
    private String nama;
    private int usia;
    
    //Konstruktor
    public Person (String nama, int usia)
    {
        this.nama = nama; //this untuk memanggil variabel pada satu class
        this.usia = usia;
    }
    //Metode
        public void info()
        {
            System.out.println("Nama :"+this.nama);
            System.out.println("Üsia :"+this.usia);
        }
}
