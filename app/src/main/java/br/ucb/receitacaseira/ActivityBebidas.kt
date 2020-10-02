package br.ucb.receitacaseira

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_bebidas.*

class ActivityBebidas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebidas)

        var arrayMenu : Array<String> = arrayOf("Coca-Cola 600ml","Coca-cola Lata","Suco Del Vale","Ice Tea Leão","Guaraná Antartica 600ml","Guarana Antartica Lata","Suco Laranja Caseira","Suco Del Vale ")
        val adapter = ArrayAdapter(this,R.layout.nomebedidas,arrayMenu)
        lvBebidas.adapter = adapter
    }
}