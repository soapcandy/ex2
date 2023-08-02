package org.zerock.ex2.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.zerock.ex2.repository.MemberRepository;

@Service
@Log4j2
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        log.info("-----------------------loadUserByUserName-----------------------");
        log.info("-----------------------loadUserByUserName-----------------------");
        log.info(username);
        log.info("-----------------------loadUserByUserName-----------------------");
        log.info("-----------------------loadUserByUserName-----------------------");

        return null;
    }
}
