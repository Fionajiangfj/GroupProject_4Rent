package com.pp.a4rent.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pp.a4rent.databinding.ActivityBlogDetailBinding
import com.pp.a4rent.models.Blog

class BlogDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBlogDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlogDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val blog = intent.getSerializableExtra("CURRENT_BLOG") as Blog

        binding.title.text = blog.title
        binding.description.text = blog.description
        val imageName = blog.image
        val imageResId = resources.getIdentifier(imageName, "drawable", packageName)
        binding.image.setImageResource(imageResId)

        binding.btnBack.setOnClickListener {
            finish()
        }

    }
}

