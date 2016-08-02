package com.wangban.yzbbanban.test_button_buy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.wangyuwei.shoppoing.ShoppingView;

public class MainActivity extends AppCompatActivity {
private ShoppingView shoppingView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shoppingView= (ShoppingView) findViewById(R.id.shopping);
        shoppingView.setOnShoppingClickListener(new ShoppingView.ShoppingClickListener() {
            @Override
            public void onAddClick(int num) {

            }

            @Override
            public void onMinusClick(int num) {

            }
        });
    }
}
