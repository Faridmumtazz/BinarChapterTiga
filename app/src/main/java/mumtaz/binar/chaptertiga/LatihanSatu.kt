package mumtaz.binar.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latihan_satu.*

class LatihanSatu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_satu)

        btnproses.setOnClickListener {
            val nama = textsatu.text.toString()
            val nilai = textdua.text.toString()
            if (textdua.text.toString().toInt() < 60 && textdua.text.toString().toInt() == 100){
                hasilnyaa.text = " Lulus"
            }else{
                hasilnyaa.text = " Tidak Lulus"
            }

            hasilnya.text = "nama : $nama nilai : $nilai"

        }
    }
}