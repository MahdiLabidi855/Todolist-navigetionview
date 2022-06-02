package com.example.todolist_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.drawerlayout.widget.DrawerLayout
import com.example.todolist_app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val drawer = findViewById<DrawerLayout>(R.id.drawerlayout)
        toggle = ActionBarDrawerToggle(this, drawer, R.string.Open, R.string.Close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.myname-> Toast.makeText(this,"Mahdi",Toast.LENGTH_SHORT).show()
                R.id.myemail -> Toast.makeText(this,"exmple@gmail.com",Toast.LENGTH_SHORT).show()
                R.id.myphone -> Toast.makeText(this,"9418886",Toast.LENGTH_SHORT).show()
                R.id.password -> Toast.makeText(this,"Password",Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}