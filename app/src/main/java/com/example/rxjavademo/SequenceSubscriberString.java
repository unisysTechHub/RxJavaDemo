package com.example.rxjavademo;

import android.util.Log;

import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class SequenceSubscriberString implements Observer {

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(Object o) {
        Log.d("@Ramesh", "value :" + String.valueOf(o)+"Ramesh" );
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
