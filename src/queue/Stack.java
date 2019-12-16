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
public class Stack {

    private CDNode top;
    private int count;

    public Stack() {
        top = null;
        count = 0;
    }

    private boolean isEmpty() {
        return (top == null);
    }

    public void push(CDNode newcd) {
        if (newcd != null) {
            newcd.setPrev(top);
            top = newcd;
        }
    }

    public String list() {
        if (isEmpty()) {
            return "no nodes in queue";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Contents of stack: ").append(count);

        CDNode current = top;

        while (current != null) {
            sb.append(current.getArtist()).append("with").append(current.getTracks());
            sb.append("\n");
            current = current.getPrev();
        }
        return sb.toString();
    }

    public CDNode pop() {
        if (isEmpty()) {
            return null;
        }
        count--;
        top = top.getPrev();
        CDNode remove = top;

        return remove;
    }

    public CDNode peek() {
        return top;
    }

    public boolean contains(String name) {
        if (isEmpty()) {
            return false;
        }//if
        CDNode current = top;

        while (current != null) {
            if (current.getArtist().compareToIgnoreCase(name) == 0) {
                return true;
            }//if
            current = current.getPrev();

        }//while

        return false;
    }//contains
}


