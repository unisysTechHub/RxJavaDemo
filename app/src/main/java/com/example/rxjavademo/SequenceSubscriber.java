package com.example.rxjavademo;

import android.util.Log;

import io.reactivex.Emitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class SequenceSubscriber implements  Observer {


    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(Object value) {
        Log.d("@Ramesh", "value :" + String.valueOf(value) );
    }

    @Override
    public void onError(Throwable error) {

    }

    @Override
    public void onComplete() {
            Log.d("@Ramesh", "emission completed");
    }
}
