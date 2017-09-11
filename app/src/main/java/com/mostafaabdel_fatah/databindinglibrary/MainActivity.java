package com.mostafaabdel_fatah.databindinglibrary;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mostafaabdel_fatah.databindinglibrary.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User user = new User("Mostafa","AbdElFatah");
        binding.setUser(user);
    }
}
