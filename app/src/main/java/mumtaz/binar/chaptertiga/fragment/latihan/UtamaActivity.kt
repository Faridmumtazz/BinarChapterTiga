package mumtaz.binar.chaptertiga.fragment.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_utama.*
import mumtaz.binar.chaptertiga.R

class UtamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utama)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_frame, HomeFragment())
            .commit()

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuhome -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, HomeFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menupromo -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, PromoFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuchat-> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, ChatFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menuhomee-> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_frame, PesananFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}