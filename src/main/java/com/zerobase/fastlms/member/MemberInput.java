package com.zerobase.fastlms.member;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class MemberInput {

    private String userId;
    private String username;
    private String password;
    private String Phone;
}
