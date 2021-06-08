package kg.tutorialapp.my37urok

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class FragmentA:Fragment(R.layout.fragment_a) {
    lateinit var tv_text:TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv_text=view.findViewById(R.id.tv_text)
        val textFromArgument=arguments?.getString("String")
        tv_text.text=textFromArgument
    }

    companion object{

        lateinit var arguments: Any
        const val TAG="A"
    }





}