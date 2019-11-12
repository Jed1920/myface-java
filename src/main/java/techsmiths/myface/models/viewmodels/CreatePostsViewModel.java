package techsmiths.myface.models.viewmodels;

import techsmiths.myface.models.dbmodels.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreatePostsViewModel {

    private Map<Integer,String> users = new HashMap<>();

    public CreatePostsViewModel(List<User> users) {
        for(User user : users){
            this.users.put(user.getId(),String.format("%s %s", user.getFirstName(), user.getLastName()));
        }
    }

    public Map<Integer, String> getUsers() {
        return users;
    }
}
