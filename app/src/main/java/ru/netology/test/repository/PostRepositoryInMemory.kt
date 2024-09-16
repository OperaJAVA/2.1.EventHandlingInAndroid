package ru.netology.test.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.test.dto.Post

class PostRepositoryInMemory : PostRepository {
    private var post = Post(
        1L,
        "Нетология. Университет интернет-профессий будущего",
        "21 мая в 18:36",
        "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
        true,
        1_000,
        1,
        false

    )
    private val data = MutableLiveData(post)
    override fun get(): LiveData<Post> = data

    override fun favorite() {
        post = post.copy(
            likedByMe = !post.likedByMe,
            liked = if (post.likedByMe) post.liked - 1 else post.liked + 1
        )
        data.value = post
    }

    override fun share() {
        post = post.copy(repostByMe = !post.repostByMe, repost = post.repost + 1)
        data.value = post
    }
}