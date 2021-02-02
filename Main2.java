package main;

import java.util.*;

class Cars implements Comparable<Cars>{

    public int position;
    public double time;

    public Cars() {

    }
    public Cars(int position,double speed) {
        this.position = position;
        this.time = speed;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "position=" + position +
                ", time=" + time +
                '}';
    }


    @Override
    public int compareTo(Cars o) {
        return this.position - o.position;
    }
}
public class Main2 {

    //找主要元素
//    public int majorityElement(int[] nums) {
//        int len = nums.length;
//        Arrays.sort(nums); //125555599
//        for (int i = 0; i <= len / 2; i++) {
//            int j = i + len / 2;
//            if(nums[i] == nums[j]) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }

    //转置矩阵
//    public static int[][] transpose(int[][] A) {
//        int[][] ret = new int[A[0].length][A.length];
//        for(int i = 0; i < A[0].length; i++) {
//            for(int j = 0; j < A.length; j++) {
//                ret[i][j] = A[j][i];
//            }
//
//        }
//        return ret;
//    }

//    public static String replaceSpace(StringBuilder str) {
////        String s1 = str.toString();
////        String s = s1.replaceAll(" ", "%20");
////        return s;
//    }

    //输入一个链表，按链表从尾到头的顺序返回一个ArrayList
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode cur = listNode;
//        while(cur != null) {
//            list.add(cur.val);
//            cur = cur.next;
//        }
//        ArrayList<Integer> list1 = new ArrayList<>();
//        while(!list.isEmpty()) {
//            list1.add(list.remove(list.size() - 1));
//        }
//        return list1;
//    }

    // 比较版本号
//    public static int compareVersion(String version1, String version2) {
//        String[] s1 = version1.split("\\.");
//        String[] s2 = version2.split("\\.");
//        int maxLen = Math.max(s1.length,s2.length);
//        for (int i = 0; i < maxLen; i++) {
//            int nums1 = 0;
//            int nums2 = 0;
//            if(i < s1.length) {
//                nums1 = Integer.valueOf(s1[i]);
//            }
//            if(i < s2.length) {
//                nums2 = Integer.valueOf(s2[i]);
//            }
//            if(nums1 > nums2) {
//                return 1;
//            } else if(nums1 < nums2){
//                return -1;
//            }
//        }
//        return 0;
//
//    }

    //长按键入
//    public static boolean isLongPressedName(String name, String typed) {
//        char[] ch1 = name.toCharArray();
//        char[] ch2 = typed.toCharArray();
//        int i = 0, j = 0;
//        while(j < ch2.length) {
//            if(i < ch1.length && ch1[i] == ch2[j]) {
//                i++;
//                j++;
//            } else if(j > 0 && ch2[j - 1] == ch2[j]) {
//                j++;
//            } else {
//                return false;
//            }
//        }
//        return i == ch1.length;
//    }

    //寻找数组的中心索引
//    public int pivotIndex(int[] nums) {
//        int sum = 0;
//        for(int x : nums) {
//            sum += x;
//        }
//        int totle = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(totle == sum - totle - nums[i]) return i;
//            totle += nums[i];
//        }
//        return -1;
//    }

    //加一
//    public static int[] plusOne(int[] digits) {
//        int n = digits.length;
//        for(int i = n - 1; i >= 0; i--) {
//            digits[i]++;
//            digits[i] %= 10;
//            if(digits[i] != 0) {
//                return digits;
//            }
//        }
//        digits = new int[n + 1];
//        digits[0] = 1;
//        return digits;
//    }


    public static int  carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if(n == 1) return 1;
        Cars[] car = new Cars[n];
        Cars cars = new Cars();
        for(int i = 0; i < n; i++) {
            car[i] = new Cars(position[i],(target - position[i]) / (double)speed[i]);
        }
        Arrays.sort(car);
        int count = n;
        for (int i = n - 2; i >= 0; i--) {
            Cars cur = car[i];
            Cars next = car[i + 1];
            if(cur.time <= next.time) {
                count--;
                cur.time = next.time;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        System.out.println(carFleet(target, position, speed));
//        int[] nums = {4,3,3};
//        System.out.println(thirdMax(nums));
//        plusOne(nums);
//        String s1 = "laiden";
//        String s2 = "laiden";
//        System.out.println(isLongPressedName(s1,s2));
//        System.out.println(compareVersion(s1, s2));
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Integer> list = new ArrayList<>();
//        list.remove(list.size() - 1);
//        String str1 = "saeed";
//        String str2 = "ssaaedd";
//        System.out.println(isLongPressedName(str1, str2));

//        int i=0;
//        Integer j = new Integer(0);
//        System.out.println(i==j);
//        System.out.println(j.equals(i));

//        String str = "helloworld ";
//        String s = str.replaceAll(" ", "%20");
//        System.out.println(s);

//        sb.append(" hello  world");
//        System.out.println(replaceSpace(sb));

    }
}
