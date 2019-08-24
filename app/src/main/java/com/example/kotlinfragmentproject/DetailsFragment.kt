package com.example.kotlinfragmentproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kotlinfragmentproject.data.Celeb
import kotlinx.android.synthetic.main.celeb_item.*
import kotlinx.android.synthetic.main.details_fragment.*

class DetailsFragment : Fragment() {

    var firstName: String = "Name"
    var description: String = "Description"
    var celebImage: Int = R.drawable.emptyperson

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.details_fragment, container, false)
    }






    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvFirstNameDetails.text = firstName
        tvDescription.text = description
        ivCelebPic.setImageResource(celebImage)

    }






    fun receivedCeleb(celeb: Celeb){
        Log.d("Tag",celeb.firstName)


        firstName = celeb.firstName
    }






}