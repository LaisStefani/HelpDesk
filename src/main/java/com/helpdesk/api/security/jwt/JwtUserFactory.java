package com.helpdesk.api.security.jwt;

import java.util.ArrayList;
import java.util.List;

import com.helpdesk.api.security.entity.User;
import com.helpdesk.api.security.enums.ProfileEnum;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class JwtUserFactory {
    private JwtUserFactory() {
    }

    // Cria um jwt user com base nos dados do usuario
    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getProfile())
        );
    }

    // Converte o perfil para o perfil do secury
    private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profileEnum) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(profileEnum.toString()));
        return authorities;
    }
}

