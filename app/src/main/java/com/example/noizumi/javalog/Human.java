package com.example.noizumi.javalog;

/**
 * Created by noizumi on 2016/09/06.
 */
import android.util.Log;

public class Human extends Animal implements Thinkable {
    // メンバ変数
    String name;  // 名前
    int age;    // 年齢
    String hobby;
    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は"+this.name + "です。歳は" + this.age + "歳です。");
    }

    @Override
    public void think(){
        Log.d("javatest", "私は"+this.hobby + "について考える。");
    }
}
