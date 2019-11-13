package techsmiths.myface.models.viewmodels;

import techsmiths.myface.models.dbmodels.Post;

import java.util.List;
import java.util.stream.Collectors;

public class AllPostsViewModel {
    private final List<PostViewModel> posts;
    private final int currentPageNumber;

    public AllPostsViewModel(List<Post> posts, int currentPageNumber) {
        this.posts = posts.stream()
                .map(PostViewModel::new)
                .collect(Collectors.toList());
        this.currentPageNumber = currentPageNumber;
    }

    public String getNextPageUrl() {
        return String.format("/users?page=%d", currentPageNumber + 1);
    }
    public String getPreviousPageUrl() {
        if (currentPageNumber == 1) {
            return null;
        }
        return String.format("/users?page=%d", currentPageNumber - 1);
    }

    public List<PostViewModel> getPosts() {
        return posts;
    }
}
