package com.zspt.app.library_common.rx;


import com.zspt.app.library_common.base.model.HttpResult;
import com.zspt.app.library_common.net.ApiException;



import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by yuequan on 2017/10/9.
 */

public class RxManager {

    private RxManager() {
    }



    private static class SingletonHolder {
        private static final RxManager INSTANCE = new RxManager();
    }

    public static RxManager getInstance() {
        return SingletonHolder.INSTANCE;
    }


    public <T> Subscription doSubscribe(Observable<T> observable, Subscriber<T> subscriber) {
        return observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    public <T> Subscription doSubscribe1(Observable<HttpResult<T>> observable, Subscriber<T> subscriber) {
        return observable
                .map(new Func1<HttpResult<T>, T>() {
                    @Override
                    public T call(HttpResult<T> httpResult) {
                        if (httpResult.getStatus()!=200) {
                            throw new ApiException();
                        }
                        return httpResult.getData();
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
