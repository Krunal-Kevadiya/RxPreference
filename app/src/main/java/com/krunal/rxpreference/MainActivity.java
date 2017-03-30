package com.krunal.rxpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.kevadiyakrunalk.rxpreference.EncryptedPreferences;
import com.kevadiyakrunalk.rxpreference.rxpref.RxSharedPreferences;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private RxSharedPreferences mRxSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRxSharedPreferences = new RxSharedPreferences(EncryptedPreferences.getInstance(this, "sample", "example"));
        mRxSharedPreferences.putString("Name", "abc");

        String string = mRxSharedPreferences.getString("Name", "xyz");

        mRxSharedPreferences.observeString("Name", "xyz")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        Log.e("DATA", s);
                    }
                });
    }
}
