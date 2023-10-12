package com.stock.test1.web;

import com.stock.test1.entities.Article;
import com.stock.test1.security.entities.User;
import com.stock.test1.security.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private UserRepository userRepository;

    @GetMapping("/pageUser")
    public Page<User> userPage(
            @RequestParam (defaultValue = "") String keyword,
            @RequestParam (defaultValue = "0") int page,
            @RequestParam (defaultValue = "5") int size
    ){
       return userRepository.findByNomContains(keyword, PageRequest.of(page, size));
    }

    @GetMapping("/users")
    public List<User> getUsers (){
        return  userRepository.findAll();
    }

    @PostMapping("/addUser")
    public User ajouterUser(@RequestBody User user) {


        String userId = UUID.randomUUID().toString();
        user.setId(userId);

        // Appeler le service pour enregistrer l'utilisateur
        User createdUser = userRepository.save(user);

        return createdUser;
    }

    @GetMapping("/user/{id}")
    public User getUserByID(@PathVariable String id){
        return userRepository.findById(id).orElse(null);
    }

    @PutMapping("/updateUser")
    public User modifierUser(@RequestBody User user){
        User user1 = userRepository.findById(user.getId()).orElse(null);

        return userRepository.save(user1);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void supprimeUser(@PathVariable String id){
        userRepository.deleteById(id);
    }


}
