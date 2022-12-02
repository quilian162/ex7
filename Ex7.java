package com.mycompany.ex7;

public class Ex7 {

    public static void main(String[] args) {
        Conjunto conjunto1 = new Conjunto(10,20);
        Conjunto conjunto2 = new Conjunto(15,80);
        Data data1 = new Data(30,04,2003);
        Data data2 = new Data(05,10,1999);
        
        System.out.println(conjunto1.igual(conjunto2));
        System.out.println(conjunto1.maior(conjunto2));
        System.out.println(conjunto1.menor(conjunto2));
        
        System.out.println(data1.igual(data2));
        System.out.println(data1.maior(data2));
        System.out.println(data1.menor(data2));
        
    }
}
