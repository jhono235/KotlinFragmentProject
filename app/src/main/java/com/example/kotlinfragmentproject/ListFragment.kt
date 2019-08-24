package com.example.kotlinfragmentproject

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinfragmentproject.data.Adapters.CelebRvAdapter
import com.example.kotlinfragmentproject.data.Celeb
import kotlinx.android.synthetic.main.details_fragment.*

import kotlinx.android.synthetic.main.fragment_list.*
import kotlinx.android.synthetic.main.fragment_list.view.*


public class ListFragment : Fragment(){

    private val mCelebList = listOf(
        Celeb("Morgan","Freeman", 82, "Morgan Freeman is one of the most " +
                "accomplished actors ever", R.drawable.morganfreeman),
        Celeb("Robert", "Downy Jr.", 54, "Robert Downy Jr. is best known for his role as Tony Stark " +
                "in te Iron Man and Avengers movies", R.drawable.robertdowny ),
        Celeb("Denzel", "Washington", 64, "Denzel Washington is one of the biggest stars in Hollywood " +
                "and most of his movies are must see. ", R.drawable.denzelwashington ),
        Celeb("Dwayne", "The Rock"+" Johnson", 47, "Dwayne Johnson transitioned from being one of the most popular " +
                "wrestlers in the world to being one of the most sought after actors in the business. ", R.drawable.denzelwashington ),
        Celeb("Samuel ", "Jackson", 70, "Samuel Leroy Jackson is an American actor and film producer. A recipient of critical acclaim and numerous " +
                "accolades and awards, Jackson is the actor whose films have made the highest total gross revenue.", R.drawable.samuelljackson ),
        Celeb("Tom", "Cruise", 64, "Thomas Cruise is an American actor and film producer. He has received several accolades for his work, including three Golden" +
                " Globe Awards and nominations for three Academy Awards.", R.drawable.tomcruise ),
        Celeb("Robert", "De Niro", 76, "Robert Anthony De Niro Jr. is an American-Italian actor, producer, and director. He is a recipient of numerous accolades, including two Academy Awards and a " +
                "Golden Globe Award", R.drawable.robertdeniro ),
        Celeb("Leonardo", "DiCaprio", 44, "Leonardo Wilhelm DiCaprio is an American actor, film producer, and environmentalist. " +
                "His accolades include an Academy Award and three Golden Globe Awards.", R.drawable.leonardo ),
        Celeb("Bruce", "Lee", 33, "Lee Jun-fan, known professionally as Bruce Lee, was a Hong Kong-American actor, director, martial artist, " +
                "martial arts instructor, and philosopher. ", R.drawable.brucelee ),
        Celeb("Johnny", "Depp", 56, "John Christopher Depp II is an American actor, producer, and musician. He has been nominated for 10 Golden Globe Awards, " +
                "winning one for Best Actor for his performance", R.drawable.johnnydepp )


    )

    private var listener: CelebrityClickedListener?=null


    interface CelebrityClickedListener{
        fun onCelebClicked(celebItem: Celeb)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context is CelebrityClickedListener){
            listener = context
        }
    }












    //populate the views now tha the layout has been inflated
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true


    }




    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_list, container, false)



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.rvCelebList.layoutManager = LinearLayoutManager(activity)
        rvCelebList.adapter = CelebRvAdapter(mCelebList, {celeb: Celeb -> onCelebrityClicked(celeb)  })



    }

    private fun onCelebrityClicked(celebItem: Celeb){
        listener?.onCelebClicked(celebItem)
        Toast.makeText(this.context, "Clicked: ${celebItem.firstName}", Toast.LENGTH_LONG).show()

    }






    companion object {

    }



}
