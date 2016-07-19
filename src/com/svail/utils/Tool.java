package com.svail.utils;

/**
 * Created by ZhouXiang on 2016/7/17.
 */
public class Tool {
    /**
     * 判断v是否小于w，如果小于，则返回true，否则返回false
     * @param v
     * @param w
     * @return
     */
    public static boolean less(Comparable v,Comparable w){
        int result=v.compareTo(w);
        return v.compareTo(w)<0;
    }


    /**
     * 交换数组中i和j的值
     * @param a 数组a
     * @param i
     * @param j
     */
    public static void exchange(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;

    }

    /**
     * 打印数组a中的所有元素
     * @param a
     */
    public static void printArray(Comparable[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=0;i<a.length;i++){
           if(less(a[i],a[i-1]))
               return false;
        }
        return true;
    }
}
