package com.svail;

import com.svail.rank_algorithm.Sort;
import com.svail.utils.Tool;

import static com.svail.utils.Tool.printArray;

public class Main {

    public static void main(String[] args) {
        Integer[] array={34,8,64,51,32,21};

          //插入排序
//        Sort.insertionSort(array);
//        System.out.println(Tool.less(4,5));
        Tool.printArray(array);
        Sort.BubbleSort(array);
        System.out.println("排序后：");
        Tool.printArray(array);
    }
}
