package com.studio.user.Shincipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Me_solo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_solo);

    //        Add Fragment to activity
        getSupportFragmentManager().beginTransaction().add(R.id.layoutMainFragmant, new MainFragment()).commit();

    }   //Main Method

}    //Main Classs
