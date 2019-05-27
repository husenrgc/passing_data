package passing.azhar.project.com.passing_data

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
private  lateinit var data1 : EditText
    private  lateinit var data2 : EditText
    private  lateinit var btnBundle : Button
    private  lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data1 = findViewById(R.id.data1)
        data2 = findViewById(R.id.data2)
        btnBundle = findViewById(R.id.btnBundle)
        btnIntent = findViewById(R.id.btnIntent)


        btnBundle.setOnClickListener{

            val  bundle = Bundle()
            bundle.putString("data1",data1.text.toString())
            bundle.putString("data2",data2.text.toString())
            val intent = Intent(this, Kedua::class.java)
            intent.putExtras(bundle)
            startActivity(intent)


        }

        btnIntent.setOnClickListener {

            val  intent = Intent(this, Kedua::class.java)
            intent.putExtra("data1",data1.text.toString())
            intent.putExtra("data2",data2.text.toString())
            startActivity(intent)


        }
    }
}
