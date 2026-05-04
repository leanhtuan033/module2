package Stack_Queue.Palindrome;

import java.util.LinkedList;
import java.util.Scanner;

import java.util.Stack;
import java.util.Queue;

public class Palindrome_Queue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();


        String str = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
            queue.offer(c);
        }

        boolean isPalindrome = true;


        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Không phải Palindrome");
        }
    }
}
