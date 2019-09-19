package com.example.rxjavademo;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class WindowObservableSubscription implements Observer<Observable<Integer>> {
    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(Observable<Integer> integerObservable) {
        Log.d("@Ramesh","Intermediate Observable ");
                integerObservable.subscribe(new SequenceSubscriber());
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
