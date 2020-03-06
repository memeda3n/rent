package cn.watson.rent.web.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplicationRequestInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.err.println("preHandle");
//        AtomicInteger atomicInteger = SpringHelper.getBean("applicationVisitSummary", AtomicInteger.class);
//        atomicInteger.incrementAndGet();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) {
        System.err.println("postHandle");
//        AtomicInteger atomicInteger = SpringHelper.getBean("applicationVisitSummary", AtomicInteger.class);
//        atomicInteger.decrementAndGet();
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}