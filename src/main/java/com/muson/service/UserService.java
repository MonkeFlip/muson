package com.muson.service;



import com.muson.SongsAndGenres.Song;
import com.muson.domain.MusUser;
import com.muson.domain.Role;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    MusUser saveUser(MusUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    ArrayList<Song> addFavSongToUser(String username, int songId);
    Song getRandomById();
    Song getRandomFavById();
    MusUser getUser(String username);
    List<MusUser>getUsers();
}
