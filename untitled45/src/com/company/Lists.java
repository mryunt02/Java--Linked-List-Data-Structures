package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Lists {
    Node head= null;
    Node tail= null;
    void basaEkle(int x){
        Node eleman= new Node();
        eleman.data=x;
        if (head==null){
            head=eleman;
            tail=eleman;
            head.next=null;
            System.out.println("ilk eleman oluştu");
        }
        else{
            eleman.next=head;
            head=eleman;
            System.out.println("ilk eleman güncellendi");
        }
    }
    void sonaEkle(int x){
        Node eleman=new Node();
        eleman.data=x;
        if (head==null){
            head=eleman;
            tail=eleman;
            head.next=null;
            System.out.println("eleman oluştu");
        }
        else{
            tail.next=eleman;
            tail=eleman;
            eleman.next=null;
            System.out.println("son eleman güncellendi");
        }

    }
    void arayaEkle(int x,int indis){
        Node eleman=new Node();
        eleman.data=x;
        if (indis==0){
            basaEkle(x);
        }else {

            Node temp2 = head;
            int n = 1;
            while (temp2.next != null) {
                n++;
                temp2 = temp2.next;
                if (indis == n && temp2.next == null) {
                    sonaEkle(x);
                }
                Node temp3= head;
                Node temp4= head;
                for (int i=0;i!=indis;i++){
                    temp4=temp3;
                    temp3=temp3.next;
                }
                temp4.next=eleman;
                eleman.next=temp3;
break;

            }
        }

        }
        void bastanSilme(){
        if (head==null){
            System.out.println("liste zaten boş, baştan bir şey silemeyiz");
        }
        else if (head.next==null){
            head=null;
            tail=null;
            System.out.println("listede kalan son elemanı da sildin");
        }
        else
            head=head.next;

        }
        void sondanSilme(){
        if (head==null){
            System.out.println("Silinecek eleman bulunamadı");
        }
        else if (head.next==null){
            head=null;
            tail=null;
            System.out.println("son elemanı da sildiniz");
        }
        else{
            Node temp=head;
            Node temp2=head;
            while (temp.next!=null){
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            tail=temp2;
        }
        }
        void aradanSilme(int indis){
            if (indis==0){
                bastanSilme();
            }Node temp=head;
            int n=0;
            while (temp.next != null) {
                n++;
                temp = temp.next;
                if (indis == n && temp.next == null) {
                    sondanSilme();
                }

            }
            Node temp3=head;
            Node temp4=head;
            for (int i=0;i!=indis;i++){
                temp4=temp3;
                temp3=temp3.next;
            }
            temp4.next=temp3.next;



        }

    void goster() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
    }
}
