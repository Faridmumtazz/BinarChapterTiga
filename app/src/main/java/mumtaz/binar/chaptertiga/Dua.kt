package mumtaz.binar.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dua.*

class Dua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        val dataNama = intent.getStringExtra("dataNama")
        val dataNilai = intent.getStringExtra("dataNilai")
        val dataKategori = intent.getStringExtra("dataKategori")
        val infoKelulusan = intent.getStringExtra("infoKelulusan")

        tv_hasil.text = """
            Nama Mahasiswa = $dataNama
            Nilai Anda $dataNilai
            Nilai Huruf $dataKategori
        """.trimIndent()

        info_lulus.text = infoKelulusan
    }
}