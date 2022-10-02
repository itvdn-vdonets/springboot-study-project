package exmpl.springframework.api.services;

import exmpl.springframework.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
