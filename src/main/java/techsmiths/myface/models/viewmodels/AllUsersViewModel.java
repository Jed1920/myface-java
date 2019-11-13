package techsmiths.myface.models.viewmodels;

import techsmiths.myface.models.dbmodels.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllUsersViewModel {
    private final List<UserViewModel> users;
    private final int currentPageNumber;

    public AllUsersViewModel(List<User> users, int currentPageNumber) {
        this.users = users.stream()
                .map(UserViewModel::new)
                .collect(Collectors.toList());
        this.currentPageNumber = currentPageNumber;
    }

    public List<UserViewModel> getUsers() {
        return users;
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
}
