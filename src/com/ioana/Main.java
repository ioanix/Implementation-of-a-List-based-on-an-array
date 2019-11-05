package com.ioana;


public class Main {

    public static void main(String[] args) {


        MyList lista = new MyList();


        System.out.println("Initial list has " + lista.sizeOfTheList() + " elements\n");

        lista.addElement(45);
        System.out.println("Dupa adaugare, lista are " + lista.sizeOfTheList() + " elemente");
        System.out.println(lista.toString()+ "\n");


        lista.addElement(67);
        System.out.println("Dupa adaugare, lista are " + lista.sizeOfTheList() + " elemente");
        System.out.println(lista.toString() + "\n");


        lista.addElement(3);
        System.out.println("Dupa adaugare, lista are " + lista.sizeOfTheList() + " elemente");
        System.out.println(lista.toString() + "\n");


        lista.addElement(10);
        System.out.println("Dupa adaugare, lista are " + lista.sizeOfTheList() + " elemente");
        System.out.println(lista.toString() + "\n");


        lista.addElement(13);
        System.out.println("Dupa adaugare, lista are " + lista.sizeOfTheList() + " elemente");
        System.out.println(lista.toString() + "\n");


        lista.getElement(3);
        System.out.println();


        lista.removeElement(1);
        System.out.println("Dupa stergerea unui element, lista are " + lista.sizeOfTheList() + " elemente");
        System.out.println(lista.toString());



    }
}
