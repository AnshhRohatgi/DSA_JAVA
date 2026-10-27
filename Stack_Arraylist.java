// package DSA_JAVA_VS;

import java.util.ArrayList;

public class Stack_Arraylist {

    ArrayList<Integer> list = new ArrayList<>();

    void push(int data) {
        list.add(data);
    }

    int pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    int peek() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Stack_Arraylist s = new Stack_Arraylist();

        // s.push(10);
        // s.push(20);
        // s.push(30);

        // System.out.println(s.pop());
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.isEmpty());

        int x =10;
        while (x<=100){
            s.push(x);
            x+= 10;
        }

        for (int l = 0; l <= s.list.size(); l++) {
            System.out.print("-----");
        }
        System.out.println();

        for (int X : s.list) {
            System.out.print("| " + X + " ");
        }
        System.out.println();

        for (int l = 0; l <= s.list.size(); l++) {
            System.out.print("-----");
        }
    }
}