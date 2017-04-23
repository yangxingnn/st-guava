package com.aocute.main;

/**
 * Created by yangx on 17-4-23.
 */
class TwoTuple<A,B>{
    public final A fir;
    public final B sec;
    public TwoTuple(A a, B b){
        this.fir = a;
        this.sec = b;
    }
    public String toString(){
        return "("+fir+","+sec+")";
    }
}
class ThirdTuple<A,B,C> extends TwoTuple<A,B>{
    public final C thi;
    public ThirdTuple(A a, B b,C c) {
        super(a, b);
        this.thi=c;
    }

    @Override
    public String toString() {
        return "("+fir+","+sec+","+thi+")";
    }
}
class TupleTest<A,B> {
    public static TwoTuple<String,Integer> f(){
        return new TwoTuple<String, Integer>("asdf",1234);
    }
}

public class Generics {
    public static void main(String[] args){
        TwoTuple<String,Integer> twoTuple = new TwoTuple<String, Integer>("asd",123);
        System.out.println(twoTuple.toString());
    }


}
