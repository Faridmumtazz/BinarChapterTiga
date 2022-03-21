package mumtaz.binar.chaptertiga.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import mumtaz.binar.chaptertiga.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

//        parsingSerializable()
        parsingParcelable()
    }

    fun parsingSerializable(){
        btn_serializable.setOnClickListener {
            val pindah = Intent(this, SecondActivity::class.java)
            val dataperson = Person("Binar", "binar@gmail.com")
            pindah.putExtra("ANSATU",dataperson)
            startActivity(pindah)
        }
    }

    fun parsingParcelable(){
        btn_parcelable.setOnClickListener {
            val pindah = Intent(this, SecondActivity::class.java)
            val dataperson = PersonParcelable("Binar dua","binardua@gmail.com")
            pindah.putExtra("ANDUA", dataperson)
            startActivity(pindah)
        }
    }
}