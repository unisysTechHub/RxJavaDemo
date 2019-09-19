package com.example.rxjavademo;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.GroupedObservable;

public class SequenceSubscriptionByGroup implements Observer<GroupedObservable> {


    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(GroupedObservable groupedObservable) {

         groupedObservable.count().subscribe( x -> Log.d("@Ramesh" ,"Count : " + x));

         //groupedObservable.subscribe(x -> Log.d("@Ramesh", x+""));


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {


        }

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
