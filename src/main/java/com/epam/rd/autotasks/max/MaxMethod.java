package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        //throw new UnsupportedOperationException();
        OptionalInt res;
        if(values != null && values.length !=0){
            int max = values[0];
            for(int value : values){
                if(value> max) max = value;
            }
            res = OptionalInt.of(max);
        }
        else{
            res = OptionalInt.empty();
        }
        return res;
    }
}