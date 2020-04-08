package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User el : users) {
            if (el.getUsername().equals(login)) {
                return el;
            }
        }
        throw new UserNotFoundException("User " + login + " not found in user list");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException(user + " not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Denis Shubko", true)};

        try {
            User user = findUser(users, "Denis Shubko");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException une) {
            une.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
