package mumtaz.binar.chaptertiga.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_utama.*
import mumtaz.binar.chaptertiga.R

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, FirstFragment())
                .commit()
        }

        first_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, FirstFragment())
                    .commit()
            }
        }

        second_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, SecondFragment())
                    .commit()
            }
        }

        third_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, ThirdFragment())
                    .commit()
            }
        }
    }
}