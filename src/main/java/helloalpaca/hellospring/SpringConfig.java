package helloalpaca.hellospring;

import helloalpaca.hellospring.repository.JdbcMemberRepository;
import helloalpaca.hellospring.repository.MemberRepository;
import helloalpaca.hellospring.repository.MemoryMemberRepository;
import helloalpaca.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Autowired
    private DataSource datasource;

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JdbcMemberRepository(datasource);
    }

}
