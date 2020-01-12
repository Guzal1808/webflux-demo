package slideShowDemo;

import com.example.webfluxdemo.model.Tweet;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author Zaynulina Guzal
 */
public class GetIfAvailableWithSupplier {
//    @Bean
    Tweet tweetBean() {
        return new Tweet("test msg");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(GetIfAvailableWithSupplier.class);
        ObjectProvider<Tweet> beanProvider = context.getBeanProvider(Tweet.class);
        Tweet exampleBean = beanProvider.getIfAvailable(() -> new Tweet("default msg"));
        System.out.println(exampleBean);
    }
}
