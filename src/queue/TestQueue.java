/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author b-hou
 */
public class TestQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonNode pn1 = new PersonNode();
        pn1.setName("Bob");
        pn1.setAge(21);
        PersonNode pn2 = new PersonNode();
        pn2.setName("Sally");
        pn2.setAge(20);
        PersonNode pn3 = new PersonNode();
        pn3.setName("Ted");
        pn3.setAge(23);
        PersonNode pn4 = new PersonNode();
        pn4.setName("Neddy");
        pn4.setAge(21);
        Queue que = new Queue();
        System.out.println(que.list());
        que.enqueue(pn1);
        que.enqueue(pn2);
        que.enqueue(pn3);
        que.enqueue(pn4);
        System.out.println(que.list());
        
        PersonNode remove = que.dequeue();
        System.out.println("Removed:"+ remove.getName());
        System.out.println(que.list());
        
        PersonNode look = que.peek();
        System.out.println("Start of the queue:"+ look.getName());
        System.out.println(que.list());
        
        System.out.println(que.contains("Neddy"));
        
        
        

    }//main
}//class

