package com.cristiangimenez.fondografia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.cristiangimenez.fondografia.FragmentosAdministrador.InicioAdmin;
import com.cristiangimenez.fondografia.FragmentosAdministrador.ListaAdmin;
import com.cristiangimenez.fondografia.FragmentosAdministrador.PerfilAdmin;
import com.cristiangimenez.fondografia.FragmentosAdministrador.RegistrarAdmin;
import com.cristiangimenez.fondografia.FragmentosCliente.AcerDeCliente;
import com.cristiangimenez.fondografia.FragmentosCliente.CompartirCliente;
import com.cristiangimenez.fondografia.FragmentosCliente.InicioCliente;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toobar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        //Fragmento por defecto
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new InicioCliente()).commit();
            navigationView.setCheckedItem(R.id.InicioCliente);


        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.InicioCliente){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new InicioCliente()).commit();
        }
        if(item.getItemId() == R.id.AcercaDe){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new AcerDeCliente()).commit();
        }
        if(item.getItemId() == R.id.Compartir){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new CompartirCliente()).commit();
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return super.onOptionsItemSelected(item);
    }
}