package myPackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class Demo {
    public static void main(String[] args) {
        Queue<String> list = new LinkedList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("a");

        for (String s:
             list) {
            System.out.println(s);
        }
        System.out.println("---");

        list.remove();

        list.remove("e");

        for (String i:
             list) {
            System.out.println(i);
        }
    }
}
// sap xep theo hang;

// ko dam bao cac phan tu la duy nhat;

// Xoa auto item dau tien;

// truyen doi so nao xoa item do;
