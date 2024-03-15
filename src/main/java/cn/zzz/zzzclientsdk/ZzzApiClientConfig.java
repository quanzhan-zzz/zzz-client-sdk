package cn.zzz.zzzclientsdk;

import cn.zzz.zzzclientsdk.client.ZzzApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Zzzz API 客户端配置类
 * @author zzz
 */
@Data
@Configuration
@ConfigurationProperties("zzz.client")
@ComponentScan
public class ZzzApiClientConfig {

    private String accessKey;

    private String secretKey;

    /**
     * 此处方法取名无所谓的，不影响任何地方
     *
     * @return
     */
    @Bean
    public ZzzApiClient getApiClient() {
        return new ZzzApiClient(accessKey, secretKey);
    }
}
