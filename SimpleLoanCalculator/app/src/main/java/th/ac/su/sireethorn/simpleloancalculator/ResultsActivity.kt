package th.ac.su.sireethorn.simpleloancalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        var tvResultsshow = findViewById<TextView>(R.id.tvResult)

        val resultall = intent.getStringExtra("resultsAll")
        tvResultsshow.setText(resultall)



        var btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            var intent = Intent()
            setResult(Activity.RESULT_OK,intent)

            finish()
        }
        }

    }
