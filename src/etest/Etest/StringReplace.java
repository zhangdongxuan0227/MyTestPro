package etest.Etest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 张星晨 on 2017/6/13. 字符替换
 */
public class StringReplace {
    public static void main(String[] args) {
        String str1 = "wo shi yige ceshi yuan";
        System.out.println(str1.replace("wo", "ni"));
        System.out.println(str1.replace("ceshi", "chengxu"));
    }
}

    /*    int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("kaishi");
  /*      for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

//    private static void quickSort(int low, int high, int[] arr) {
//        if (low < high) {
//            int start = low;
//            int end = high;
//            int mid = arr[low];
//            while (low < high) {
//                while (low < high && arr[high] >= mid) {
//                    high--;
//                }
//                arr[low] = arr[high];
//                while (low < high && arr[low] <= mid) {
//                    low++;
//                }
//                arr[high] = arr[low];
//            }
//            arr[low] = mid;
//            quickSort(start, low - 1, arr);
//            quickSort(low + 1, end, arr);
//        }
    }
}
*/