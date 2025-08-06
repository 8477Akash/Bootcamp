package com.akash.spring_security_2.security;
import com.akash.spring_security_2.model.Role;
import com.akash.spring_security_2.model.User;
import com.akash.spring_security_2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.HashSet;
@Service
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        String email = oAuth2User.getAttribute("email");

        User user = userRepository.findByEmail(email).orElseGet(() -> {
            return userRepository.save(User.builder()
                    .email(email)
                    .name(oAuth2User.getAttribute("name"))
                    .provider(userRequest.getClientRegistration().getRegistrationId())
                    .providerId(oAuth2User.getName())
                    .role(Role.USER)
                    .build());
        });

        return new CustomUserPrincipal(user, oAuth2User.getAttributes());
    }
}
