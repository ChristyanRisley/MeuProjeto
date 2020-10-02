package br.ucb.receitacaseira

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_categoria.*
import kotlinx.android.synthetic.main.activity_main.*

class ActivityCategoria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria)


        btnPratos.setOnClickListener {
            val intent = Intent(this, ActivityPratos::class.java)
            startActivity(intent)
        }

        btnBebidas.setOnClickListener {
            val intent = Intent(this, ActivityBebidas::class.java)
            startActivity(intent)
        }



    }

}
