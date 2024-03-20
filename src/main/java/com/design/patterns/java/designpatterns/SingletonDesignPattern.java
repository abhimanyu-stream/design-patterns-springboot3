package com.design.patterns.java.designpatterns;

import lombok.Synchronized;

public final class SingletonDesignPattern {


    private static SingletonDesignPattern  singletonDesignPattern = null;

    private SingletonDesignPattern() {

    }

    public static SingletonDesignPattern getInstance(){

       if(singletonDesignPattern == null){
           synchronized(SingletonDesignPattern.class){
               if(singletonDesignPattern == null){

                   singletonDesignPattern= new SingletonDesignPattern();

               }
           }
       }

        return singletonDesignPattern;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
