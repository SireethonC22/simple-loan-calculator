package th.ac.su.sireethorn.simpleloancalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnClick)
        val input1 = findViewById<EditText>(R.id.edtBaht1)
        val input2 = findViewById<EditText>(R.id.edtBaht2)
        val input3 = findViewById<EditText>(R.id.edtBaht3)
        val btnData = findViewById<Button>(R.id.btnData)




        btnClick.setOnClickListener {
            var money1:Double = input1.text.toString().toDouble()
            var money2:Double = input2.text.toString().toDouble()
            var timeyear:Double = input3.text.toString().toDouble()
            var tvresults:Double = 0.0
            var num1:Double = 0.0
            var num2:Double = 0.0
            var num3:Double = 0.0

            num1 = (money1 * (money2/100) * timeyear);
            num2 = money1 + num1;
            num3 = num2 / (timeyear*12);
            tvresults = num3
            tvresults.toString()

            var intent = Intent(this@MainActivity,ResultsActivity::class.java)
            intent.putExtra("resultsAll",tvresults.toString())

            startActivity(intent)



        }

        btnData.setOnClickListener {
            var  intent = Intent(this@MainActivity,ListviewActivity::class.java)

            startActivity(intent)
        }


    }


}