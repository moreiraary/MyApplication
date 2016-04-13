package com.example.ary.productsapp.Dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ary.productsapp.BaseFragment;
import com.example.ary.productsapp.Products.AllProductsActivity;
import com.example.ary.productsapp.Products.NewProductActivity;
import com.example.ary.productsapp.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by AMoreira on 4/13/16.
 */
public class DashboardFragment extends BaseFragment implements View.OnClickListener{

    @Bind(R.id.btnViewProducts)
    Button mViewProducts;
    @Bind(R.id.btnCreateProduct)
    Button mCreateNewProducts;

    private DashboardFragmentListener mListener;

    public static DashboardFragment newInstance() {
        return new DashboardFragment();
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if(activity instanceof DashboardFragmentListener) {
            mListener = (DashboardFragmentListener) activity;
        } else {
            throw new RuntimeException("Activity needs to implement Listener");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_dashboard,container,false);
        ButterKnife.bind(this,viewGroup);
        setUp();
        return viewGroup;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private void setUp(){
        mViewProducts.setOnClickListener(this);
        mCreateNewProducts.setOnClickListener(this);
    }

    public interface DashboardFragmentListener {
        void viewProducts();
        void addProduct();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnViewProducts:
                mListener.viewProducts();
                break;
            case R.id.btnCreateProduct:
                mListener.addProduct();
                break;
            default:
                break;
        }

    }
}
