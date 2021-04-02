package helloalpaca.hellospring;

import helloalpaca.hellospring.repository.MemberRepository;
import helloalpaca.hellospring.repository.MemoryMemberRepository;
import helloalpaca.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
