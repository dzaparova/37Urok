package kg.tutorialapp.my37urok

import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kg.tutorialapp.my37urok.FragmentA
import kg.tutorialapp.my37urok.R.*
import kotlinx.android.synthetic.main.activity_main.*
import androidx.fragment.app.FragmentTransaction as FragmentTransaction


class MainActivity : AppCompatActivity() {
//    37 дз

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        setup()

        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener{
            Toast.makeText(this,"Menu navigation",Toast.LENGTH_SHORT).show()
        }


    }

    private fun setup(){
       val btn_ed=findViewById<Button>(R.id.btn_ed)
        val ed_Text=findViewById<EditText>(R.id.ed_Text)
        btn_ed.setOnClickListener {
            val text=ed_Text.text.toString()


            val fragment= FragmentA()

            val args=Bundle()
            args.putString("String",text)


            fragment.arguments=args



            supportFragmentManager
                .beginTransaction()
                .add(R.id.container,fragment,FragmentA.TAG)
                .commit()
        }
        ed_Text.setOnClickListener {
            val text = "Введите данные"
            val edt = Toast.LENGTH_LONG
            if (ed_Text.getText().length == 0) {

                val toast = Toast.makeText(applicationContext, text, edt)
                toast.show()
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.mainmenu,menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {


     var id=item.getItemId()
        if (id==R.id.item1){
            Toast.makeText(this,"ItemOne",Toast.LENGTH_LONG).show()
            return true
        }
        if (id==R.id.item2){
            Toast.makeText(this,"ItemTwo",Toast.LENGTH_LONG).show()
            return true
        }
        if (id==R.id.item3){
            Toast.makeText(this,"ItemThree",Toast.LENGTH_LONG).show()
            return true
        }
        if (id==R.id.item4){
            Toast.makeText(this,"ItemFour",Toast.LENGTH_LONG).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}






