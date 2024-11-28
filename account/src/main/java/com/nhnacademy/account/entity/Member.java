package com.nhnacademy.account.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {
    @Id
    @Length(min = 3, max = 20)
    private Long memberId;

    @Length(min = 3, max = 20)
    @NotNull
    @Setter
    private String memberPwd;

    @Length(max = 50)
    @NotNull
    @Setter
    private String memberEmail;

    @Length(max = 20)
    @NotNull
    @Setter
    private String memberName;

    @Length(max = 20)
    @NotNull
    @Setter
    private String memberState;
}
