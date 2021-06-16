package study.core;

import study.core.discount.DiscountPolicy;
import study.core.discount.FixDiscountPolicy;
import study.core.discount.RateDiscountPolicy;
import study.core.member.MemberService;
import study.core.member.MemberServiceImpl;
import study.core.member.MemoryMemberRepository;
import study.core.order.OrderService;
import study.core.order.OrderServiceImpl;

public class AppConfig {

    //생성자 주입
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }
}
