package com.UserManagement.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class springSecurity {
	 @Autowired
     private UserDetailsService userDetailsService;

     @Bean
     public static PasswordEncoder passwordEncoder() {
             return new BCryptPasswordEncoder();
     }

     @Bean
     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
             http
                             .authorizeHttpRequests((authorize) -> authorize
                                             .requestMatchers("/webjars/**").permitAll()
                                             .requestMatchers("/register/**").permitAll()
                                             .requestMatchers("/forgot/**").permitAll()
                                             .requestMatchers("/index").permitAll()
                                             .requestMatchers("/").permitAll()
                                             .requestMatchers("/users/**").hasRole("ADMIN")
                                             .requestMatchers("/add/**").hasRole("ADMIN")
                                             .requestMatchers("/delete/**").hasRole("ADMIN")
                                             .requestMatchers("/edit/**").hasRole("ADMIN"))
                             .formLogin(
                                             form -> form
                                                             .loginPage("/login")
                                                             .loginProcessingUrl("/login")
                                                             .defaultSuccessUrl("/users")
                                                             .permitAll())
                             .logout(
                                             logout -> logout
                                                             .logoutRequestMatcher(
                                                                             new AntPathRequestMatcher("/logout"))
                                                             .permitAll());
             return http.build();
     }

      @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
                auth
                                .userDetailsService(userDetailsService)
                                .passwordEncoder(passwordEncoder());
        }
}