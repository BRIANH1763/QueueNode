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
public class PersonNode {

    private String name;
    private int age;
    private PersonNode next;
    private PersonNode prev;

    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode pn) {
        this.next = pn;
    }

    public PersonNode getPrev() {
        return prev;
    }

    public void setPrev(PersonNode pn) {
        this.prev = pn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonNode() {

    }
}//class


