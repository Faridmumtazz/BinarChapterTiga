package mumtaz.binar.chaptertiga.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import mumtaz.binar.chaptertiga.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val dataperson = intent.getSerializableExtra("ANSATU") as Person
//        txt_serializable.text = dataperson.toString()
//        txt_serializabledua.text = dataperson.name

//        Get data parcelable
        val dataparcelable = intent.getParcelableExtra("ANDUA") as PersonParcelable?
        txt_parcelable.text = dataparcelable.toString()
    }
}