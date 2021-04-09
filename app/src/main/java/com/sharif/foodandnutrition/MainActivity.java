package com.sharif.foodandnutrition;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.sharif.foodandnutrition.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button carbohydrate,protien,fat,vitamin,water;
    ActivityMainBinding binding;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth=FirebaseAuth.getInstance();

        carbohydrate=(Button) findViewById(R.id.carbohydratesid);
        protien=(Button)findViewById(R.id.protienid);
        fat=(Button)findViewById(R.id.fatsid);
        vitamin=(Button)findViewById(R.id.vitaminsid);
        water=(Button) findViewById(R.id.waterid);

        carbohydrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,carbohydrateActivity.class);
                startActivity(intent);
            }
        }) ;
        protien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,protienActivity.class);
                startActivity(intent);
            }
        }) ;
        fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,fatActivity.class);
                startActivity(intent);
            }
        });
        vitamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,vitaminActivity.class);
                startActivity(intent);
            }
        });
        water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,waterActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
             auth.signOut();
             Intent intent = new Intent(MainActivity.this,SignInActivity.class);
             startActivity(intent);
                break;
        }
        return true;
    }
}