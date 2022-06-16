package com.jiangwei.mybatisplusstudy.common;

public class ReturnR {
    public static R booleanToR(Boolean b){
        if(b){
           return R.ok();
        }else {
           return R.error();
        }
    }

    public static<T> R objToR(String name,T t){
        if(t!=null){
            return R.ok().data(name,t);
        }else {
            return R.error();
        }
    }
}
