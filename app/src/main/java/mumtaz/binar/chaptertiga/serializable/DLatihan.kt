package mumtaz.binar.chaptertiga.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dlatihan.*
import mumtaz.binar.chaptertiga.R

class DLatihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dlatihan)

        val dataHasil = intent.getParcelableExtra("ANTIGA") as Luas?
        tv_hasil.text = dataHasil.toString()
    }
}