package org.hashtables;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public class Node {

        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
        public HashTable() {
            dataMap = new Node[size];
        }

        public void printTable() {
            for (int i = 0; i < dataMap.length; i++) {
                System.out.println(i + ":");
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + "= " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }



    }

