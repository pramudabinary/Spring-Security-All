package lk.test.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 12/5/21
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //    Authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("pramuda")
                .password("1234")
                .roles("USER")
                .and()
                .withUser("tharika")
                .password("246")
                .roles("ADMIN");

    }

    //Password Encoding
    public PasswordEncoder getPasswordEncode() {
        return NoOpPasswordEncoder.getInstance();
    }
}
