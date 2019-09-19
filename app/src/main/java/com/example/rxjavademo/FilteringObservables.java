package com.example.rxjavademo;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class FilteringObservables  {

    public  static void distinct()
    {
        CreateObservable.create(10).distinct( x -> 1).
                forEach(x -> Log.d("@Ramesh", "value: " + x)).dispose();
    }

    public static Observable<Integer> filter()
    {
        return CreateObservable.create(10).filter( x -> x%2 == 0);
    }

    public  static Observable<Integer> sample()
    {
        return CreateObservable.create(10).sample(3000, TimeUnit.MILLISECONDS);
    }
}
