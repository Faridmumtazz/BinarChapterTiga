package mumtaz.binar.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {

            val username = et_username.text.toString()
            val pass = et_pass.text.toString()
            if (username == "admin" && pass == "12345"){
                text_login.text = "OK"
                startActivity(Intent(this, Beranda::class.java))

            }else{
                text_login.text = "Gagal Login"
            }

        }
    }
}