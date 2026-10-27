
// import java.util.Scanner;
// import java.util.LinkedList;

import java.util.Stack;
import java.util.ArrayDeque;

public class DSA {
    public static void main(String[] args) {

        // STACK

        System.out.println("Stack --->\n");

        Stack<Integer> st = new Stack<>();
        // st.push(10);
        // st.push(10);
        // st.push(10);
        // st.push(10);
        // st.push(10);
        // st.push(10);
        // st.push(10);

        int i = 100;

        while (i > 0) {
            st.push(i);
            i = i - 10;
            System.out.println("|\t" + st.peek() + "\t|");
        }

        // ARRAYDEQUE

        System.out.println("\nQueue --->\n");
        ArrayDeque<Character> aq = new ArrayDeque<>();

        // for(char ch : aq){
        // aq.add(ch);
        // System.out.println(aq.remove());
        // }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            aq.add(ch);
        }

        for (int l = 0; l <= aq.size(); l++) {
            System.out.print("----");
        }
        System.out.println();

        // while (!aq.isEmpty()) {
        // System.out.print(aq.poll() + " | ");
        // }

        for (char x : aq) {
            System.out.print("| " + x + " ");
        }
        System.out.println();

        for (int l = 0; l <= aq.size(); l++) {
            System.out.print("----");
        }
        System.out.println();

        // for(int j =0; j<=aq.size(); j++){
        // System.out.print("---");
        // System.out.print(aq.poll());
        // System.out.print("---");
        // }
        // System.out.println(aq);

        // LINKED LIST : ARRAY

        /*
         * --------    -----    ------    ------    ------    -------    -------    -------    --------    --------
         * | ansh | -> | a | -> | an | -> | as | -> | ah | -> | ans | -> | anh | -> | ash | -> | ansh | -> | NULL |
         * --------    -----    ------    ------    ------    -------    -------    -------    --------    --------
         */

        System.out.println("\nLinked List : Array --->\n");
        

        String[] nodes = { "ansh", "a", "an", "as", "ah", "ans", "anh", "ash", "ansh", "NULL" };

        // Top border
        for (String node : nodes) {
            System.out.print("-".repeat(node.length() + 4) + "    ");
        }
        System.out.println();

        // Nodes and arrows
        for (int il = 0; il < nodes.length; il++) {
            System.out.print("| " + nodes[il] + " |");

            if (il < nodes.length - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();

        // Bottom border
        for (String node : nodes) {
            System.out.print("-".repeat(node.length() + 4) + "    ");
        }
        System.out.println();


    }

}
