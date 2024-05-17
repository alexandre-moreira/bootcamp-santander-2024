package junglesoft.springdatajpa;

import junglesoft.springdatajpa.model.User;
import junglesoft.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        List<User>users = repository.filtrarPorNome("Alex Souza");
//        for(User u: users){
//            System.out.println(u);
//        }

        User user =  new User();
        user.setName("Alex Souza");
        user.setUserName("asouza");
        user.setPassword("dio123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
