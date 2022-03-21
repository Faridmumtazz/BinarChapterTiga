package mumtaz.binar.chaptertiga.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clatihan.*
import mumtaz.binar.chaptertiga.R

class CLatihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clatihan)

        parsingParcelable()
    }

    fun parsingParcelable(){
        btn_hitung.setOnClickListener {

            val pindah = Intent(this, DLatihan::class.java)
            val dataluas = Luas (20, 10)
            pindah.putExtra("ANTIGA", dataluas)
            startActivity(pindah)
        }
    }
}