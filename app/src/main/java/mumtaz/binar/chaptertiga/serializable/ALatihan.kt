package mumtaz.binar.chaptertiga.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alatihan.*
import mumtaz.binar.chaptertiga.R

class ALatihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alatihan)

        parsingDataSerializable()
    }

    fun parsingDataSerializable(){
        btn_next.setOnClickListener {
            val pindah = Intent(this, BLatihan::class.java)
            val datalatihan = Latihan("Hiu",30,"Laut","Berenang")

            pindah.putExtra("LATIHAN",datalatihan)
            startActivity(pindah)
        }
    }
}