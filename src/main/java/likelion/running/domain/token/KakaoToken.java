package likelion.running.domain.token;


import lombok.*;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KakaoToken {
    private String token_type;
    private String access_token;
    private Integer expires_in;
    private String refresh_token;
    private Integer refresh_token_expires_in;
    private String scope;


}

