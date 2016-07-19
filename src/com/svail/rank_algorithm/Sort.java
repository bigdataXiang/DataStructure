package com.svail.rank_algorithm;

import static com.svail.utils.Tool.exchange;
import static com.svail.utils.Tool.less;

/**
 * Created by ZhouXiang on 2016/7/17.
 */
public class Sort {
    /**
     * 插入排序
     * @param array
     */
    public static void insertionSort(Integer[] array){
        int j;
        for(int i=0;i<array.length;i++){
            int tmp=array[i];
            for(j=i;j>0&&new Integer(tmp).compareTo(new Integer(array[j-1]))<0;j--){
                array[j]=array[j-1];
            }
            array[j]=tmp;
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    /**
     * 选择排序
     * @param a
     */
    public static void selectedSort(Comparable[] a){
        int N=a.length;
        for(int i=0;i<N;i++){
            int min=i; //建立最小元素的索引
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min])){
                    min=j;
                }

            }
            exchange(a,i,min);

        }

    }

    /**
     * 冒泡排序
     */
    public static void BubbleSort(Comparable[] a){
        int N=a.length;
        for(int i=0;i<N-1;i++){
            for(int j=i;j<N-1;j++){
                if(!less(a[i],a[j+1])){
                    exchange(a,i,j+1);
                }

            }

        }

    }


    /**
     * 快速排序
     */
    public static void QuickSort(Comparable[] a){

    }



}
