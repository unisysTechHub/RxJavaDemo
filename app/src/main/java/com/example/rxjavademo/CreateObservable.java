package com.example.rxjavademo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class CreateObservable {

    public static Observable<Integer> create(int noOfitesms)
    {


        return Observable.create( subscriber -> {

                    for(int i=1;i<=noOfitesms;i++)
                    {
                        subscriber.onNext(i);
                        subscriber.onNext(i);
                        Thread.sleep(2000);

                    }

                    subscriber.onComplete();
        });

    }

    public static Observable defer()
    {

        return Observable.defer( () -> {return  Observable.interval(1000, TimeUnit.MILLISECONDS);});

    }

    public static  Observable empty()
    {

        return Observable.empty();
    }

    public static Observable never()
    {

        return  Observable.never();
    }

    public static Observable from(List<String> flowers)
    {
        return  Observable.fromArray(flowers);
    }

    public  static  Observable just(List<String> flowers)
    {
        return  Observable.just(flowers);
    }

    public static  Observable range(int min, int max)
    {

        return  Observable.range(min,max);
    }

    public  static  Observable repeat()
    {
        return  Observable.just("repeat").repeat();
    }
    public  static Observable time(Long time)
    {

        return  CreateObservable.create(5).timer(time,TimeUnit.MILLISECONDS);
    }


}

