package org.stacks;

public class Stack {

    private Node top;
    int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }


    public void printStack(){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.value);
            temp = temp.next;

        }
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    //PUSH(Adding a node into the stack)
    public void push(int value){
        Node newNode=new Node(value);
        if (height==0){
            top=newNode;
        }
        else {
           newNode.next=top;
           top=newNode;
               }
        height++;
    }

    //POP(removing node from the stack)
    public Node pop(){
        if(height==0)return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }

}
