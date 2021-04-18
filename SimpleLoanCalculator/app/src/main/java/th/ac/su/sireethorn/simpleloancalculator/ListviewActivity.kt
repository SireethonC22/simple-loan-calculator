package th.ac.su.sireethorn.simpleloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import th.ac.su.sireethorn.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.sireethorn.simpleloancalculator.data.Promotion

class ListviewActivity : AppCompatActivity() {

        var itemList : ArrayList<Promotion> = ArrayList<Promotion>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val jsonFileString = getJsonDataFromAsset(applicationContext,"promotion.json")
        val gson = Gson()
        val listItemType = object : TypeToken<ArrayList<Promotion>>(){}.type

    }
}