package dev.kanini.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.kanini.workoutlog.databinding.ActivityHomeBinding
import dev.kanini.workoutlog.databinding.ActivitySignUpBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        castViews()
        setupBottomNav()
    }
    fun castViews(){

    }
    fun setupBottomNav(){
        binding.btnnavigation.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.plan->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,planfragment()).commit()
                    true
                }
                R.id.track ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,Trackfragment()).commit()
                    true

                }
                R.id.profile ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,ProfileFragment()).commit()
                    true

                }
                else->false

            }

        }
        
    }
}