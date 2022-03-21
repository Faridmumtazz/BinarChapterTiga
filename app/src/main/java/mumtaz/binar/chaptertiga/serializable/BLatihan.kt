package mumtaz.binar.chaptertiga.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_blatihan.*
import mumtaz.binar.chaptertiga.R

class BLatihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blatihan)

        val datalatihan = intent.getSerializableExtra("LATIHAN") as Latihan

        tv_namaa.text = datalatihan.name
        tv_umur.text = datalatihan.umur.toString()
        tv_alamat.text = datalatihan.alamat
        tv_hobi.text = datalatihan.hobi

        val ket = datalatihan.umur
        if (ket % 2 == 0){
             "Genap"
        }else{
             "Ganjil"
        }
    }
}