package ru.netology.test.repository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.netology.test.dto.Post
class PostRepositoryInMemory: PostRepository {
    private var post = Post(
        1L,
        "Нетология.",
        "16.09.2024",
        "Привет! Я разработчик андроид приложений от Нетологии!",
        true,
        1_000,
        1,
        false

    )
    private val data = MutableLiveData(post)
    override fun get():LiveData<Post> = data

    override fun favorite() {
    post = post.copy(likedByMe =!post.likedByMe, liked=if (post.likedByMe) post.liked - 1 else post.liked + 1 )
    data.value=post
}
}