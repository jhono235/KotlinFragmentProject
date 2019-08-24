package com.example.kotlinfragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinfragmentproject.ListFragment
import com.example.kotlinfragmentproject.data.Celeb
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.details_fragment.*

class MainActivity : AppCompatActivity(),
ListFragment.CelebrityClickedListener{

    var detailsFragment : DetailsFragment? = null










    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        detailsFragment = fragDetails as DetailsFragment
    }

    override fun onCelebClicked(celebItem: Celeb) {
        //Log.d("Tag", ""+celebItem)
        detailsFragment?.receivedCeleb(celebItem)



    }


}
