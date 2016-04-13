package com.example.ary.productsapp.Dashboard;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import com.example.ary.productsapp.Products.AllProductsActivity;
import com.example.ary.productsapp.BaseActivity;
import com.example.ary.productsapp.Products.NewProductActivity;
import com.example.ary.productsapp.R;

public class DashboardActivity extends BaseActivity implements DashboardFragment.DashboardFragmentListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        getSupportFragmentManager().beginTransaction().add(R.id.container,DashboardFragment.newInstance(),null).addToBackStack(null).commit();
    }

    @Override
    public void viewProducts() {
      startActivity(new Intent(this,AllProductsActivity.class));
    }

    @Override
    public void addProduct() {
        startActivity(new Intent(this,NewProductActivity.class));
    }
}
