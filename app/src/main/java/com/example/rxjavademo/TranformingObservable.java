package com.example.rxjavademo;

import android.util.Log;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class TranformingObservable {

    public static Observable<List<Integer>> buffer()
    {
        Log.d("@Ramesh", "transformingObservable by buffer");
        return CreateObservable.create(10).buffer(3);
    }

    public static Observable<Long> flatMap()
    {
        Log.d("@Ramesh", "transformingObservable by flatMap");

      return CreateObservable.create(5)
                .flatMap( s -> {
                    return Observable.interval(1000,TimeUnit.MILLISECONDS);
                });

    }

    public static Observable<Long> switchMap()
    {
        Log.d("@Ramesh", "transformingObservable by flatMap");

        return CreateObservable.create(5)
                .switchMap( s -> { Log.d("@Ramesh","seqence value "+s );
                    return Observable.interval(1000,TimeUnit.MILLISECONDS);
                });

    }

    public static void groupBy()
    {
        CreateObservable.create(20).
                groupBy( x -> { return x%3;}, x-> {return x;}).
                subscribe( group ->
                {
                    Log.d("@Ramesh", "group");
                    group.count().subscribe( x ->  Log.d("@Ramesh",x+""));
                    //group.subscribe( x-> Log.d("@Ramesh", "value"+x));

                });

    }

    public static Observable<Integer> scan()
    {
        return  CreateObservable.create(10).scan( (x, y)->{return x+y;});

    }
    public static Observable<Observable<Integer>> window()
    {
        return CreateObservable.create(20).window(4);

    }
}
