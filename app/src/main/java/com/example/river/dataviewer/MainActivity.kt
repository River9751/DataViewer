package com.example.river.dataviewer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.SimpleAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = arrayOf(
                arrayOf("Group1", "Title1-1", "Sub1-1", "Title1-2","Sub1-2"),
                arrayOf("Group2", "Title2-1", "Sub2-1", "Title2-2","Sub2-2"),
                arrayOf("Group3", "Title3-1", "Sub3-1", "Title3-2","Sub3-2"),
                arrayOf("Group4", "Title4-1", "Sub4-1", "Title4-2","Sub4-2")
        )

        val items = ArrayList<Map<String, Any>>()
        for (i in 0 until data.size) {
            val item = HashMap<String, Any>()
            item["Group"] = data[i][0]
            item["Title1"] = data[i][1]
            item["Sub1"] = data[i][2]
            item["Title2"] = data[i][3]
            item["Sub2"] = data[i][4]
            items.add(item)
        }

        val adapter = SimpleAdapter(
                this,
                items,
                R.layout.custom,
                arrayOf("Group", "Title1", "Sub1", "Title2", "Sub2"),
                intArrayOf(R.id.title00,R.id.title01,R.id.item01, R.id.title02, R.id.item02)
        )

        LV01.adapter = adapter
    }
}
