package com.usersapi.endpoints.detail;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("Could not find the user with id " + id + ".");
    }
}
