package com.project.instaton

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat
import com.project.instaton.fragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.hide()

        val homeBtn = findViewById<ImageView>(R.id.home_icon)
        val searchBtn = findViewById<ImageView>(R.id.search_icon)
        val galleryBtn = findViewById<ImageView>(R.id.add_icon)
        val favouriteBtn = findViewById<ImageView>(R.id.heart_icon)
        val profileBtn = findViewById<ImageView>(R.id.profile_icon)

        getSupportFragmentManager().beginTransaction().replace(R.id.frame, HomeFragment()).commit()

        homeBtn.setOnClickListener(clickListener)
        searchBtn.setOnClickListener(clickListener)
        galleryBtn.setOnClickListener(clickListener)
        favouriteBtn.setOnClickListener(clickListener)
        profileBtn.setOnClickListener(clickListener)
    }

    private val clickListener : View.OnClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.home_icon -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, HomeFragment()).commit()
            }
            R.id.search_icon -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, SearchFragment()).commit()
            }
            R.id.add_icon -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, GalleryFragment()).commit()
            }
            R.id.heart_icon -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, FavouriteFragment()).commit()
            }
            R.id.profile_icon -> {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, ProfileFragment()).commit()
            }
        }
    }
}