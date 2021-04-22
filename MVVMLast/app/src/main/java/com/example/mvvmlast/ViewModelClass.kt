package com.example.mvvmlast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class ViewModelClass :ViewModel() {

    var quote = MutableLiveData<String>()
    private lateinit var quoteList:MutableList<String>

    init {
        getListOfQuotes()
    }


     fun getListOfQuotes() {
        var i :Int = Random.nextInt(11)
        quoteList = mutableListOf(
            "Sometimes life hits you in the head with a brick. Don't lose faith.",
            "Great things in business are never done by one person. They're done by a team of people.",
            "Design is not just what it looks like and feels like. Design is how it works.",
            "My favorite things in life don't cost any money. It's really clear that the most precious resource we all have is time.",
            "I want to put a ding in the universe.",
            "Stay hungry, stay foolish.",
            "We made the buttons on the screen look so good you'll want to lick them.",
            "Be a yardstick of quality. Some people aren't used to an environment where excellence is expected.",
            "Computers themselves, and software yet to be developed, will revolutionize the way we learn.",
            "Things don't have to change the world to be important.",
            "You can't just ask customers what they want and then try to give that to them. By the time you get it built, they'll want something new.",
            "For you to sleep well at night, the aesthetic, the quality, has to be carried all the way through."

        )
        quoteList.shuffle()
        quote.value=  quoteList[i]
    }

}