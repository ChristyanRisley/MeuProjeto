package br.ucb.receitacaseira

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_pratos.*

class ActivityPratos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pratos)

        var arrayMenu : Array<String> = arrayOf("X-Mega","X-Up","X-Down","X-Alt","X-CtrlC","X-Alt","X-Shift")
        val adapter = ArrayAdapter(this,R.layout.nomepratos,arrayMenu)
        lvPratos.adapter = adapter

    }
}