package com.example.rxjavademo;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class CombiningObservables {

public static Observable<Integer> join()
{
    return CreateObservable.create(10).join(CreateObservable.create(10), x -> {return Observable.timer(500,TimeUnit.MILLISECONDS);},
            y -> {return Observable.timer(1000,TimeUnit.MILLISECONDS);}
    , (x,y) -> x+y).take(5);

}
}
