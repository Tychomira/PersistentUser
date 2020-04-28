package persistentuser;

import entities.User;
import java.util.List;

public class PersistentUser {

    public static void main(String[] args) {

        /*
        
        findById (int id)
        findAll ()
        save (User user)  //insert into 
        update (int id, User user)
        delete (int id)
        
         */
        
        
        
        services.UserImpl userService = new services.UserImpl();
        User user = userService.findById(2);
        if (user == null) {
            System.out.println("Oh!!!! Something is not found");
        } else {
            System.out.println(user);
        }

        List<User> users = userService.findAll();
        for (User user1 : users) {
            System.out.println(user1);
        }

        int i = 1;
        boolean delete = userService.deleteById(i);
        if (delete) {
            System.out.println("User with id= " + i + " deleted successfully!");
        }

        //Update use with id=2!
        
        int id = 2;
        User newUser = new User("George", "Nikolaou", "3756932", "djhdhfd@jdjdjd.com");
        boolean update = userService.updateById(id, newUser);
        if (update) {
            System.out.println("User with id: " + id + "Updated successfully!");
        }

        User userInsert=new User("Katy", "Leme", "6546633", "kdnidh@cnsd.com");
        boolean insert=userService.save(userInsert);
        
    }

}
