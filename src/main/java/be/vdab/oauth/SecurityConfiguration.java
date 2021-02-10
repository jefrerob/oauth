package be.vdab.oauth;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.oauth2Login();
        http.authorizeRequests(requests -> requests .mvcMatchers("/").permitAll()
                .mvcMatchers("/beveiligd").authenticated());
    }
}