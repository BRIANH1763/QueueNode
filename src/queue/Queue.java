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
public class Queue {

    private int size;
    private PersonNode start;
    private PersonNode end;

    public Queue() {
        size = 0;
        start = null;
        end = null;
    }//constructor

    private boolean isEmpty() {
        return start == null;
    }//isEmpty

    public void enqueue(PersonNode pnode) {
        if (isEmpty()) {
            start = pnode;
            end = pnode;
        } else {
            end.setPrev(pnode);
            pnode.setNext(end);
            end = pnode;
        }
        size++;
    }//enqueue

    public String list() {
        if (isEmpty()) {
            return "No nodes in queue";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Contents of Queue (No of nodes:").append(size).append(")\n");
        PersonNode current = start;
        while (current != null) {
            sb.append(current.getName()).append(" aged ").append(current.getAge());
            sb.append("\t");
            current = current.getPrev();
        }
        sb.append("\n");
        return sb.toString();
    }//list

    public PersonNode dequeue() {
        if (isEmpty()) {
            return null;
        }
        PersonNode remove = start;
        size--;
        if (start.getPrev() != null) {
            start = start.getPrev();
            start.setNext(null);

        } else {
            start = null;
            end = null;
        }
        return remove;
    }

    public PersonNode peek() {
        return start;
    }

    public boolean contains(String name) {
        if (isEmpty()) {
            return false;
        }//if
        PersonNode current = start;

        while (current != null) {
            if (current.getName().compareToIgnoreCase(name)==0) {
                return true;
            }//if
            current = current.getPrev();

        }//while

        return false;
    }//contains
}
