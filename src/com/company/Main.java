package com.company;
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> ops = new ArrayList<>();
        for (String arg : args) if (arg.charAt(0) > 48 && arg.charAt(0) < 57) nums.add(Integer.parseInt(arg));
        for (String arg : args) if (arg.charAt(0) == 42 || arg.charAt(0) == 43 || arg.charAt(0) == 45 || arg.charAt(0) == 47 || arg.charAt(0) == 37) ops.add(arg);
        if (nums.size() == 2 && ops.size() == 1) {
            if (ops.get(0).equals("+"))
                System.out.println(nums.get(0) + " + " + nums.get(1) + " = " + (nums.get(0) + nums.get(1)));
            else if (ops.get(0).equals("-"))
                System.out.println(nums.get(0) + " - " + nums.get(1) + " = " + (nums.get(0) - nums.get(1)));
            else if (ops.get(0).equals("*"))
                System.out.println(nums.get(0) + " * " + nums.get(1) + " = " + nums.get(0) * nums.get(1));
            else if (ops.get(0).equals("/"))
                System.out.println(nums.get(0) + " / " + nums.get(1) + " = " + (double) nums.get(0) / (double) nums.get(1));
            else if (ops.get(0).equals("%"))
                System.out.println(nums.get(0) + " % " + nums.get(1) + " = " + nums.get(0) % nums.get(1));
        }
    }
}
