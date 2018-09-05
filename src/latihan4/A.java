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
class A {
    private int a;//private itu akses modifire
    public void setA (int nilai) //mutator
    {
        a = nilai;
    }
    
    public int getA() //asesor
    {
        return a;
    }
    public void tampilkanNilai()
    {
        System.out.println("Nilai a : "+getA());
    }
    
    
    private int c;//private itu akses modifire
    public void setC (int nilai) //mutator
    {
        c = nilai;
    }
    
    public int getC() //asesor
    {
        return c;
    }
    public void tampilkanNilaiC()
    {
        System.out.println("Nilai c : "+getC());
    }
}
//void tidak bisa mengembalikan nilai, int bisa mengembalikan nilai