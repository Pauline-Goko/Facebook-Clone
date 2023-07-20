package com.example.facebookclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.facebookclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayPosts()
    }


    fun displayPosts(){
        var post1 = FacebookData("https://i.pinimg.com/236x/9f/11/98/9f119847ba03cc1320c47c8bfc53d590.jpg", "John Jil",
        "Life is too short to worry about what others think. Just be yourself and let your " +
                "true colors shine on Facebook and beyond.", "Mercy Kimani, Sam Drake and 123 others",
            23)
        var post2 = FacebookData("https://i.pinimg.com/236x/0c/2e/5c/0c2e5c6ae0393845bf3a4c159c933f03.jpg", "Sasha Fierce", "In a world full of" +
                " updates and notifications, take a moment to disconnect and connect with what" +
                " truly matters – the people around you.", "Nana Lavender, Mercy Luu and" +
                "21 others", 54)
        var post3 = FacebookData("https://i.pinimg.com/236x/60/82/3f/60823f679b52a16c912d378c66d22d80.jpg", "Xamine Clara",
            "Success is not a destination, but a journey of continuous growth and learning." +
                    " Keep pushing your limits, and greatness will follow.", "Mercy Kimani, Sam Drake and 123 others",
            23)
        var post4 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Zoe Hanna", "In a world full of" +
                " updates and notifications, take a moment to disconnect and connect with what" +
                " truly matters – the people around you.", "Nana Lavender, Mercy Luu and" +
                "21 others", 54)
        var post5 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Dana Frankie",
            "In the face of challenges, remember that resilience is your superpower. You have" +
                    " the strength to overcome anything that comes your way", "Mercy Kimani, Sam Drake and 123 others",
            23)
        var post6 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Ana Nande", "Embrace the beauty" +
                " of diversity, for it enriches our world and expands our perspectives. Together," +
                " we can build a more inclusive tomorrow.", "Nana Lavender, Mercy Luu and" +
                "21 others", 54)
        var post7 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Jojo Samantha",
            "Happiness is not found in external possessions, but in the depths of your own" +
                    " heart. Cultivate gratitude and find joy in the simplest moments.", "Mercy Kimani, Sam Drake and 123 others",
            23)
        var post8 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Ava Dominic", "Dream big, work " +
                "hard, and never underestimate your potential. The future belongs to those who " +
                "believe in the power of their dreams.", "Nana Lavender, Mercy Luu and" +
                "21 others", 54)
        var post9 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Julia Jean",
            "Life is too short to worry about what others think. Just be yourself and let your " +
                    "true colors shine on Facebook and beyond.", "Mercy Kimani, Sam Drake and 123 others",
            23)
        var post10 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Sam Susan", "In a world full of" +
                " updates and notifications, take a moment to disconnect and connect with what" +
                " truly matters – the people around you.", "Nana Lavender, Mercy Luu and" +
                "21 others", 54)
        var post11 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "John James",
            "Life is too short to worry about what others think. Just be yourself and let your " +
                    "true colors shine on Facebook and beyond.", "Mercy Kimani, Sam Drake and 123 others",
            23)
        var post12 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Felix Owuor", "In a world full of" +
                " updates and notifications, take a moment to disconnect and connect with what" +
                " truly matters – the people around you.", "Nana Lavender, Mercy Luu and" +
                "21 others", 54)
        var post13 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Ken Maina",
            "Life is too short to worry about what others think. Just be yourself and let your " +
                    "true colors shine on Facebook and beyond.", "Mercy Kimani, Sam Drake and 123 others",
            23)
        var post14 = FacebookData("https://i.pinimg.com/236x/23/1e/27/231e27b8a69ff944a5a9e3a609fdb530.jpg", "Essie Muthoni", "In a world full of" +
                " updates and notifications, take a moment to disconnect and connect with what" +
                " truly matters – the people around you.", "Nana Lavender, Mercy Luu and" +
                "21 others", 54)

        var faceboolLists = listOf<FacebookData>(post1, post2, post3,post4, post5, post6, post7, post8,
        post9, post10, post11, post12, post13, post14)

        binding.rvPosts.layoutManager = LinearLayoutManager(this)
        var adapterPosts = FacebookRVAdapter(faceboolLists)
        binding.rvPosts.adapter = adapterPosts
    }

}