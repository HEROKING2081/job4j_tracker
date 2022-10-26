package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                user = value;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User is not found.");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rls = false;
        if (user.getValid() && user.getUsername().length() > 3) {
            rls = true;
        }
        if (!rls) {
            throw new UserInvalidException("User is not validate");
        }
        return false;
    }

    public static void main(String[] args) throws UserNotFoundException {
        try {
            User[] users = {
                    new User("Petr Arsentev", true),
                    new User("Prokopenko Bogdan", true),
                    new User("Gatman Igor", true),
                    new User("Kolesova Valeriya", true),
                    new User("Gog", false),
                    new User("Bogdanchik", false)
            };
            User user1 = findUser(users, "Petr Arsentev");
            User user2 = findUser(users, "Prokopenko Bogdan");
            User user3 = findUser(users, "Gatman Igor");
            User user4 = findUser(users, "Kolesova Valeriya");
            User user5 = findUser(users, "Gog");
            User user6 = findUser(users, "Igorechik");
            if (validate(user1)) {
                System.out.println("This user has an access");
            } else if (validate(user2)) {
                System.out.println("This user has an access");
            } else if (validate(user3)) {
                System.out.println("This user has an access");
            } else if (validate(user4)) {
                System.out.println("This user has an access");
            } else if (validate(user5)) {
                System.out.println("This user has an access");
            } else if (validate(user6)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException a) {
            a.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
