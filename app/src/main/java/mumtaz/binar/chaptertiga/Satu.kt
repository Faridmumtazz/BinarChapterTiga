package mumtaz.binar.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_satu.*

class Satu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satu)

        btn_proses.setOnClickListener {

            val dataNama = et_namamhs.text.toString()
            val nilaiUts = et_Uts.text.toString().toInt()
            val nilaiUas = et_Uas.text.toString().toInt()
            val nilaiTugas = et_Tugas.text.toString().toInt()

            var totalNilai = nilaiUts + nilaiUas + nilaiTugas
            totalNilai /= 3

            var kategoriNilai = ""
            when {
                totalNilai in 90..100 -> {
                    kategoriNilai = "A"
                }
                totalNilai in 70..89 -> {
                    kategoriNilai = "B"
                }
                totalNilai in 60..69 -> {
                    kategoriNilai = "C"
                }
                totalNilai in 50..59 -> {
                    kategoriNilai = "D"
                }
            }

            var infoLulus = ""
            if (totalNilai in 61..100) {
                infoLulus = "Lulus"
            }else{
                infoLulus = "Tidak Lulus"
            }

            val pindah = Intent(this, Dua::class.java)
            pindah.putExtra("dataNama", dataNama)
            pindah.putExtra("nilaiUts", nilaiUts)
            pindah.putExtra("nilaiUas", nilaiUas)
            pindah.putExtra("nilaiTugas", nilaiTugas)

            startActivity(pindah)

        }
    }
}