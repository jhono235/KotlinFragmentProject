package com.example.kotlinfragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinfragmentproject.ListFragment
import com.example.kotlinfragmentproject.data.Celeb

class MainActivity : AppCompatActivity(),
ListFragment.CelebrityClickedListener{

    private val detailsFragment : DetailsFragment = DetailsFragment()









    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCelebClicked(celebItem: Celeb) {
        //Log.d("Tag", ""+celebItem)
        detailsFragment.receivedCeleb(celebItem)

    }


}
