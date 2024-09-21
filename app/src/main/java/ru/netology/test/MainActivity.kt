package ru.netology.test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import ru.netology.test.databinding.ActivityMainBinding
import ru.netology.test.viewmodel.PostViewModel

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel by viewModels<PostViewModel>()
        viewModel.data.observe(this) { post ->
            with(binding) {
                author.text = post.author
                published.text = post.published
                textNetology.text = post.content
                likeNumber.text = formatNumber(post.liked)
                shareNumber.text = formatNumber(post.repost)

                favoriteNumber.text = formatNumber(post.liked)
                favorite.setImageResource(
                    if (post.likedByMe) R.drawable.ic_baseline_favorite_border_red
                    else R.drawable.ic_baseline_favorite_border_24
                )

                favorite.setOnClickListener {
                    viewModel.favorite() // Обработка лайка теперь в ViewModel
                }

                share.setImageResource(
                    if (post.repostByMe) R.drawable.ic_baseline_share_24 //
                    else R.drawable.ic_baseline_share
                )

                share.setOnClickListener {
                    viewModel.share() // Обработка репоста теперь в ViewModel
                }
            }
        }

        println("onCreate $this")
    }

    // Остальные жизненные циклы активности остаются без изменений
    override fun onStart() {
        super.onStart()
        println("onStart $this")
    }

    override fun onStop() {
        super.onStop()
        println("onStop $this")
    }

    override fun onResume() {
        super.onResume()
        println("onResume $this")
    }

    override fun onPause() {
        super.onPause()
        println("onPause $this")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy $this")
    }
}