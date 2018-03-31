package com.example.think.slidemenutest;

import android.support.annotation.NonNull;
import android.support.design.internal.NavigationMenu;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import java.util.NavigableMap;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView=(NavigationView)findViewById(R.id.nav_view);

        Toolbar toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            //actionBar.setHomeAsUpIndicator(R.drawable.touxiang);//可为HomeAsUp按钮设置自定义图标
        }

        navigationView.setCheckedItem(R.id.call);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.call:
                        Toast.makeText(MainActivity.this,"check Call!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.friend:
                        Toast.makeText(MainActivity.this,"check Friends!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.location:
                        Toast.makeText(MainActivity.this,"check Location!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mail:
                        Toast.makeText(MainActivity.this,"check Mail!",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.task:
                        Toast.makeText(MainActivity.this,"check Task!",Toast.LENGTH_SHORT).show();
                        break;
                        default:break;
                }
                return true;
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            drawerLayout.openDrawer(GravityCompat.START);
        return true;
    }
}
