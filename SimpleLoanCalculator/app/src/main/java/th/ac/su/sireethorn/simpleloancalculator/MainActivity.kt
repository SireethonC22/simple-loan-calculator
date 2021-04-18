package th.ac.su.sireethorn.simpleloancalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var exchangeResults : Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnClick)
        val input1 = findViewById<EditText>(R.id.edtBaht1)
        val input2 = findViewById<EditText>(R.id.edtBaht2)
        val input3 = findViewById<EditText>(R.id.edtBaht3)




        btnClick.setOnClickListener {
            var intent = Intent(this@MainActivity, ResultsActivity::class.java)
            intent.putExtra("rate",exchangeResults)


        }
    }


}