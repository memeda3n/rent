package com.rent.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoSum {


    public static void main(String[] args)throws Exception {
        TwoSum sum=new TwoSum();
        int[] array={12,33,2123,2,12,3,89,36,54,332};
        int[] ar= sum.twoSum(array,14);
        System.out.println(ar[0]+"_"+ar[1]);
    }
    public int[] twoSum(int[] array, int target) throws Exception {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int a=target-array[i];
            if (map.containsKey(a)){
                return  new int[]{map.get(a),i};
            }
            map.put(array[i],i);
        }
        throw new Exception("不存在");
    }
}
