package mumtaz.binar.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beranda.*

class Beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        homee.setOnClickListener {
            startActivity(Intent(this, Homedua::class.java))
        }
        desc.setOnClickListener {
            startActivity(Intent(this,Profile::class.java))
        }
        web.setOnClickListener {
            startActivity(Intent(this, WebView::class.java))
        }
        logout.setOnClickListener {
            finish()
        }
    }
}