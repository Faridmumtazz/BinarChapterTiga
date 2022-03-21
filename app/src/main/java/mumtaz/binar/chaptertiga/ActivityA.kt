package mumtaz.binar.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activity_a.*

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity_a)

        btn_a.setOnClickListener {

            val datanama = et_nama.text.toString()
            val pindah = Intent(this, Activityb::class.java)
            pindah.putExtra("nama",datanama)
            startActivity(pindah)
        }

    }
}