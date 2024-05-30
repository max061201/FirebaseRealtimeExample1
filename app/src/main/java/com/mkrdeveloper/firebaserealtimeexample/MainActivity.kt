package com.mkrdeveloper.firebaserealtimeexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.mkrdeveloper.firebaserealtimeexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var firebaceRef: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        firebaceRef = FirebaseDatabase.getInstance().getReference("test")
//        binding.textView.setOnClickListener {
//        firebaceRef.setValue("DATINGAPP TEST")
//            .addOnCompleteListener {
//                Toast.makeText(this,"Data Stores Suc",Toast.LENGTH_SHORT)
//            }
//        }

        val navController = findNavController(R.id.fragmentContainerView)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.addFragment))

        setupActionBarWithNavController(navController,appBarConfiguration)

    }
}