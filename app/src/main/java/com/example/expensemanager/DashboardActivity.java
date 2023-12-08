package com.example.expensemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.expensemanager.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {

    ActivityDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent=new Intent(DashboardActivity.this,AddExpensesActivity.class );
                try {
                    startActivity(intent);
                }catch (Exception e){

                }
            }
        });

    }
}