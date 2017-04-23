package com.aocute.base;

import com.aocute.App;
import com.google.common.base.Optional;

import static com.aocute.App.sout;

/**
 * Created by yangx on 17-4-23.
 */
public class Main {
    public static void main(String[] args){
        Optional<Integer> possible = Optional.of(5);
        possible.isPresent();
        possible.get();
        App.sout("sdfs");
    }
}
