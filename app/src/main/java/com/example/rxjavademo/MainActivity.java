package com.example.rxjavademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {
    Observable switchmap;
    Observable sequnceObservable;
    int j=0;
    Button getData;
    Button subscribe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            getData=findViewById(R.id.get_data);
            subscribe=findViewById(R.id.subscribe);

            getData.setOnClickListener( view -> {
                j=j+1;
                getStringArray();
            });
ArrayList arrayList = new ArrayList();
arrayList.add("Rose");
arrayList.add("Lotus");
//CreateObservable.time((long)1000).subscribe(new SequenceSubscriber());
    // FilteringObservables.distinct();
   //  FilteringObservables.filter().subscribe(new SequenceSubscriber());
       // FilteringObservables.sample().subscribe(new SequenceSubscriber());
        CombiningObservables.join().subscribe(new SequenceSubscriber());

       // CombiningObservables.combineLatest().subscribe(new SequenceSubscriber());
          // TranformingObservable.buffer().subscribe(new SequenceSubscriber());
      //  TranformingObservable.switchMap().subscribe(new SequenceSubscriber());
        //TranformingObservable.groupBy();
        //TranformingObservable.scan().subscribe(new SequenceSubscriber());
    //  TranformingObservable.window().subscribe(new WindowObservableSubscription());


//        Observable<Long> observabledefer = Observable.defer(() -> {
//
//            return Observable.interval(1000,TimeUnit.MILLISECONDS);
//        });
//
//        observabledefer.subscribe(new SequenceSubscriber());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//
//
//        }
//
//
//        observabledefer.subscribe(new SequenceSubscriberString());

//        sequnceObservable=  Observable.create( subscriber -> {
//            Log.d("@Ramesh","observable subscribe function'");
//            if(subscriber.isDisposed()) {
//                subscriber.onComplete();
//                return;
//            }
//                String[] stringArray={"a","v"};
//            subscriber.onNext("A");
//            Thread.sleep(5000);
//            subscriber.onNext("B");
//            subscriber.onNext("c");
//            String[] stringArray1={"ay","vy"};
//
//            //subscriber.onNext(Observable.fromArray(stringArray1));
//
//
//            subscriber.onComplete();
//
//
//
//        });

//        sequnceObservable.subscribe(new SequenceSubscriber());
//        sequnceObservable.subscribe(new SequenceSubscriber());
//            subscribe.setOnClickListener( view -> {
//                switchmap.subscribe(new SequenceSubscriber());
//
//            });
//
//            getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, CreatingObservables.newInstance("",""),null).commit();









//             sequnceObservable.subscribe(( new SequenceSubscriber()));
//        sequnceObservable.subscribe(( new SequenceSubscriber()));



    }


    void  getStringArray()
    {

        sequnceObservable
                .flatMap( s -> {
                    return Observable.interval(1000,TimeUnit.MILLISECONDS);
                }).subscribe(new SequenceSubscriber());



    }


}
